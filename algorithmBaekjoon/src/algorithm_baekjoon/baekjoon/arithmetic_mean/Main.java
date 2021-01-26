package algorithm_baekjoon.baekjoon.arithmetic_mean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1546번 평균
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, score[i]);
        }
        double a = 0;
        for (int tmp : score) {
            a += (double) tmp/max *100;
        }
        System.out.println(a/N);

    }
}
