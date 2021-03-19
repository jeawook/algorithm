package algorithm_baekjoon.baekjoon.combine_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//11066번 파일 합치기
public class Main {
    static int[][] dp;
    static int[] files;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp = new int[K][K];
            files = new int[K];
            for (int j = 0; j < K; j++) {
                files[j] = Integer.parseInt(st.nextToken());
            }


        }
    }
    static void solve() {

    }
}
