package algorithm_baekjoon.code_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class X_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (int i=0;i< str.length();i++) {

        }
        long sum = str.charAt(0) - '0';
        for (int i = 1; i<str.length();i++) {
            int tmp = str.charAt(i) - '0';
            if (sum <= 1 && tmp <= 1 ) {
                sum += tmp;
            }else {
                sum *=tmp;
            }
        }
        System.out.println("sum = " + sum);
    }
}
