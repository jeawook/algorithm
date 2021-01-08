package algorithm_baekjoon.baekjoon.continuous_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1912번 연속합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp[0] = Integer.parseInt(st.nextToken());
        int max = dp[0];
        for (int i=1;i<n;i++) {
            int num = Integer.parseInt(st.nextToken());

            dp[i] = Math.max(num, dp[i-1]+num);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
