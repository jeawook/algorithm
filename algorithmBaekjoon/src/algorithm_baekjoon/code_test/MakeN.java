package algorithm_baekjoon.code_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result=0;
        while (true) {
            int target = (N / K) * K;
            result += (N - target);
            if (N < K) {
                break;
            }
            result++;
            N /= K;
        }
        result += (N -1);
        System.out.println(result);
    }
}
