package algorithm_baekjoon.baekjoon.prime_num_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1929번 소수 구하기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i=M;i<=N;i++) {
            boolean flag = true;
            for (int j=2;j<=Math.sqrt(i);j++) {
                if (i%j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag && i != 1){
                System.out.println(i);
            }
        }

    }

}
