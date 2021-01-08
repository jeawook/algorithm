package algorithm_baekjoon.baekjoon.prime_num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1978번 소수 찾기
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int sum =0;
        for (int i=0;i<N;i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n < 1) {
                continue;
            }
            int j = 2;
            while(j < n) {
                if (n % j == 0){
                    break;
                }
                j++;
            }
            if (j == n) {
                sum++;
            }
        }
        System.out.println(sum);

    }
}
