package algorithm_baekjoon.baekjoon.count_paper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1780번 종이의 개수
public class Main {
    static int[][] arr;
    static int[] cnt = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i=0;i<N;i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        divide(0,0, N);
        for (int tmp : cnt) {
            System.out.println(tmp);
        }
    }
    static void divide(int x, int y, int n) {
        int p = arr[x][y];
        boolean flag = false;
        int nextN = n/3;
        for (int i=x; i<x+n;i++) {
            for (int j=y;j<y+n;j++) {
                if (p != arr[i][j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                divide(x, y, nextN);
                divide(x, y + nextN, nextN);
                divide(x + nextN, y, nextN);
                divide(x + nextN, y + nextN, nextN);
                divide(x+nextN*2, y + nextN, nextN);
                divide(x + nextN,y + nextN*2,nextN);
                divide(x + nextN * 2, y + nextN * 2 , nextN);
                divide(x, y + nextN * 2, nextN);
                divide(x + nextN * 2, y, nextN);
                break;
            }
        }
        if (!flag) {
            cnt[p+1]++;
        }


    }

}
