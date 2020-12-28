package algorithm_baekjoon.honeycomb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2292번 벌집
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i = 1;
        int cnt = 1;
        while (i < N) {
            i += 6*cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}
