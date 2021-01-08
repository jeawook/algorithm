package algorithm_baekjoon.baekjoon.LAN_cable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//1654번 랜선 자르기
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Long[] cables = new Long[K];
        for (int i=0;i<K;i++) {
            cables[i] = Long.valueOf(Integer.parseInt(br.readLine()));
        }
        Arrays.sort(cables);
        Long left = 1L;
        Long right = cables[K-1];
        while (left <= right) {
            Long mid = (left+right)/2;
            int cnt = 0;
            for (Long tmp : cables) {
                cnt += tmp/mid;
            }
            if (N <= cnt) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
