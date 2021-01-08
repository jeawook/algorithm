package algorithm_baekjoon.baekjoon.install_modem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//2110번 공유기 설치

/**
 *  input
 *  5 3
 *  1 2 4 8 9
 *  output
 *  3
 *  input
 *  5 3
 *  1 6 7 8 9
 *  3
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] list = new int[N];

        for (int i = 0; i<N;i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);

        int left = 1;
        int right = list[N-1]-list[0];
        int n = 0;
        while (left <= right) {
            int mid = (left + right)/2;
            int pre = list[0];
            int cnt = 1;
            for (int i=1;i<N;i++) {
                int tmp = list[i];
                if (tmp - pre >= mid) {
                    cnt++;
                    pre = tmp;
                }
            }
            if (cnt >= C) {
                n = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println(n);

    }
}
