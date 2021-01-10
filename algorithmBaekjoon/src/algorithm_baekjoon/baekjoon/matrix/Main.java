package algorithm_baekjoon.baekjoon.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1080번 행렬
public class Main {
    static int N;
    static int M;
    static String[][] matrix1;
    static String[][] matrix2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        matrix1 = new String[N][M];
        matrix2 = new String[N][M];
        int cnt = 0;
        for (int i=0;i<N;i++) {
            matrix1[i] = br.readLine().split("");
        }
        for (int i=0;i<N;i++) {
            matrix2[i] = br.readLine().split("");
        }
        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                if (!matrix1[i][j].equals(matrix2[i][j])) {
                    if (!swap(i,j)) {
                        System.out.println("-1");
                        return;
                    }
                    cnt++;
                }
            }
        }
        if (solve()) {
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }

    }

    private static boolean solve() {
        boolean flag = true;
        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                if (!matrix1[i][j].equals(matrix2[i][j])) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        return flag;
    }

    static boolean swap(int x, int y) {
        if (x+3 > N || y+3 > M) {
            return false;
        }
        for (int i =x;i<x+3;i++) {
            for (int j=y;j<y+3;j++) {
                if (matrix1[i][j].equals("1")) {
                    matrix1[i][j] = "0";
                }else {
                    matrix1[i][j] = "1";
                }
            }
        }
        return true;
    }

}
