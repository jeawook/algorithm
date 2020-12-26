package algorithm_baekjoon.incremental_sequence2;

//12015번 가장 긴 증가하는 부분 수열 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
 *
 * 예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i=0;i<N;i++) {
            int value = Integer.parseInt(st.nextToken());
            if (list.get(list.size()-1) < value) {
                list.add(value);
            } else {
                int left = 0;
                int right = list.size()-1;
                while (left< right) {
                    int mid = (left+right)/2;
                    if (list.get(mid) >= value) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                list.set(right, value);
            }
        }
        System.out.println(list.size()-1);
    }
}
