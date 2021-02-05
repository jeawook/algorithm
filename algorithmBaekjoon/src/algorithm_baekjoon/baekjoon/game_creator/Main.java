package algorithm_baekjoon.baekjoon.game_creator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2847번 게임을 만든 동준이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = N-1; i > 0; i--) {
            if (arr[i] <= arr[i-1]) {
                cnt += (arr[i-1] - arr[i]) +1;
                arr[i - 1] = arr[i]-1;
            }
        }
        System.out.println(cnt);
    }
}
