package algorithm_baekjoon.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10872번 팩토리얼
public class Main {
    static int factorial(int n){
        if(n < 1){
            return 1;
        }
        return n * factorial(--n);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));
    }
}
