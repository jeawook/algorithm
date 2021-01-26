package algorithm_baekjoon.baekjoon.remainder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3052번 나머지
public class Main {
    static final int N = 42;
    static final int cnt = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] value = new boolean[N];
        int answer = 0;
        for (int i = 0;i < cnt; i++) {
            int n = Integer.parseInt(br.readLine());
            int na = n % N;
            if (!value[na]) {
                value[na] = true;
            }
        }
        for (boolean tmp : value) {
            if (tmp) {
                answer++;
            }
        }
        System.out.println(answer);

    }
}
