package algorithm_baekjoon.baekjoon.incremental_sequence;

//11053번 가장 긴 증가하는 부분 수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
 *
 * 예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
 * 수열 A = {50, 10, 20, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] d = new int[n];

        d[0] = 1;


        for (int i=1;i<n;i++) {
            d[i] = 1;
            for (int j = 0; j<i;j++) {
                if (list[i] > list[j] && d[i] < d[j] +1 ) {
                    d[i] = d[j]+1;
                }
            }

        }
        int max=0;
        for (int tmp : d) {
            if (max < tmp)
                max = tmp;
        }
        System.out.println(max);
    }
}
