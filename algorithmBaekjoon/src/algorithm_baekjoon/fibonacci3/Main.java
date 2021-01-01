package algorithm_baekjoon.fibonacci3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1003번 피보나치 함수
public class Main {
    static Integer[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T= Integer.parseInt(br.readLine());
        dp = new Integer[42][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());
            Integer[] tmp = fibonacci(N);
            sb.append(tmp[0]+" "+tmp[1]+"\n");
        }
        System.out.println(sb.toString());
    }
    static Integer[] fibonacci(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        return dp[n];
    }
}
