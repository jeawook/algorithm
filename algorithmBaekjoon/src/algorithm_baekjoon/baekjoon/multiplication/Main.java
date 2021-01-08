package algorithm_baekjoon.baekjoon.multiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1629번 곱셈
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long C = Long.parseLong(st.nextToken());
        System.out.println(power(A %C, B, C));
    }
    static long power(long a, long b, long c) {
        // b가 1일 때
        if(b == 1) return a;

        long temp = power(a, b / 2, c) % c;

        // b가 짝수일 때
        if(b % 2 == 0) {
            return (temp * temp) % c;
            // b가 홀수일 때
        } else {
            return (((temp * temp) % c) * a) % c;
        }
    }
}
