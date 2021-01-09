package algorithm_baekjoon.code_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//개미 전사
public class AntWarrior {
    static int[] dp;
    static int[] arr;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp = new int[N];
        arr = new int[N];
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i=2;i<N;i++) {
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
        }
        System.out.println(dp[N-1]);
    }

    static void bottomUp(int index) {
        if(N == index) {
            System.out.println("dp = " + dp[N-1]);
        }
    }
}
