package algorithm_baekjoon.baekjoon.sick_knight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1783번 병든 나이트
public class Main {
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        System.out.println(solve());

    }
    static int solve() {
        if(N==1) return 1;
        if(N==2) return Math.min(4, (M+1)/2);
        if(M<7) return Math.min(4, M);
        return M-2;
    }
}
