package algorithm_baekjoon.baekjoon.divisor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2609번 최대공약수와 최소공배수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a < b) {
            int t = b;
            b = a;
            a = t;
        }
        System.out.println(lcm(a, b));



    }
    static int gcd(int a, int b){ // 최대공약수
        while(b!=0){
            int r = a%b;
            a= b;
            b= r;
        }
        System.out.println(a);
        return a;
    }
    static int lcm(int a, int b){ // 최소 공배수
        // 0이 아닌 두 수의 곱 / 두 수의 최대공약수
        return a * b / gcd(a,b);
    }
}
