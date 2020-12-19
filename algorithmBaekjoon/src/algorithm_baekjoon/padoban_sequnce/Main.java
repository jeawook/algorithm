package algorithm_baekjoon.padoban_sequnce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9461번 파도반 수열
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0;i<num;i++) {
            int N = Integer.parseInt(br.readLine());
            Long[] seq = new Long[N + 3];
            seq[1] = 1L;
            seq[2] = 1L;
            seq[3] = 1L;
            for (int j = 4; j <= N; j++) {
                seq[j] = seq[j - 2] + seq[j - 3];
            }
            System.out.println(seq[N]);
        }

    }
}
