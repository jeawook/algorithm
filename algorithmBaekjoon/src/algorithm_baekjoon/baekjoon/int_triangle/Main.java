package algorithm_baekjoon.baekjoon.int_triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1932번 정수 삼각형
public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] list = new int[n][n];
        for (int i=0;i<n;i++) {
            list[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i=1;i<n;i++) {
            for (int j=0;j<=i;j++) {
                if (j == 0) {
                    list[i][j] += list[i-1][j];
                } else if (j == i) {
                    list[i][j] += list[i-1][j-1];
                } else {
                    list[i][j] += list[i-1][j] > list[i-1][j-1] ? list[i-1][j] : list[i-1][j-1];
                }
            }
        }
        int max = 0;
        for (int tmp : list[n-1]) {
            if (max < tmp){
                max = tmp;
            }
        }
        System.out.println(max);
    }
}
