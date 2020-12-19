package algorithm_baekjoon.fibonacci2;

import java.io.*;

//2748번 피보나치 수 2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if (x == 1 || x == 2){
            System.out.print(1);
        }else {
            Long num1 = 0L;
            Long num2 = 1L;
            Long sum = 0L;
            for (int i = 1; i < x; i++) {
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
            System.out.print(sum);
        }

    }
}