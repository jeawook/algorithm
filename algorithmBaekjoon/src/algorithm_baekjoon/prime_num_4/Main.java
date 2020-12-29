package algorithm_baekjoon.prime_num_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4948번 베르트랑 공준
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int cnt = 0;
            for (int i=n+1;i<=2*n;i++) {
                boolean isPrime = true;
                for (int j=2;j<=Math.sqrt(i);j++) {
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    cnt++;
                }
            }
            System.out.println(cnt);

        }

    }
}
