package algorithm_baekjoon.tile;

import java.io.*;


//1904번 01타일

public class Main {
    static Integer[] dp = new Integer[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        System.out.println(recur(N));
    }
    static int recur(int N) {
        if (dp[N] == null) {
            dp[N] = (recur(N-1)+recur(N-2))%15746;
        }
        return dp[N];
    }
}
