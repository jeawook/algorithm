package algorithm_baekjoon.baekjoon.society_leader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2775번 부녀회장
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] apart = new int[15][15];
        for (int i = 0; i < 15;i++) {
            apart[i][1] = 1;
            apart[0][i] = i;
        }
        for (int i = 1; i < 15;i++) {
            for (int j = 1;j < 15; j++) {
                apart[i][j] = apart[i-1][j] + apart[i][j-1];
            }
        }
        for (int i = 0; i < T; i++) {

            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(apart[k][n]);

        }
    }
}
