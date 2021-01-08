package algorithm_baekjoon.baekjoon.prime_num_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2581번 소수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int min = 0;
        int sum = 0;
        for (int i = M;i<=N;i++) {
            int j = 2;
            while (j < i) {
                if (i % j ==0) {
                    break;
                }
                j++;
            }
            if (j == i) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }
        if (min == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
