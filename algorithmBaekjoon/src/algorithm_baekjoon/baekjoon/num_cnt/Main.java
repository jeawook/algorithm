package algorithm_baekjoon.baekjoon.num_cnt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2577번 숫자의 개수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int n = A * B * C;

        while (n > 0) {
            int na = n % 10;
            n = n / 10;
            arr[na]++;
        }

        for (int t : arr) {
            System.out.println(t);
        }

    }
}
