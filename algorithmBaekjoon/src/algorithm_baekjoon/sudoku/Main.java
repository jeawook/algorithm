package algorithm_baekjoon.sudoku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//2580번 스도쿠
public class Main {
    static int N = 9;
    static int[][] arr = new int[N][N];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0;i<N;i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        sudoku(0,0);
    }
    static void sudoku(int row, int col) {
        if (col == N) {
            sudoku(row +1, 0);
            return;
        }
        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.print(sb);
            // 출력 뒤 시스템을 종료한다.
            System.exit(0);
        }

        if (arr[row][col] == 0) {
            for (int i=1;i<=N;i++) {
                if (check(row,col,i)) {
                    arr[row][col] = i;
                    sudoku(row,col+1);
                }
            }
            arr[row][col] = 0;
            return;
        }
        sudoku(row,col+1);

    }
    static boolean check(int row, int col, int value) {
        for (int i=0;i<N;i++) {
            if (arr[row][i] == value) {
                return false;
            }
        }
        for (int i=0;i<N;i++) {
            if (arr[i][col] == value) {
                return false;
            }
        }
        int s_row = row/3*3;
        int s_col = col/3*3;
        for (int i=s_row;i<s_row+3;i++) {
            for (int j=s_col;j<s_col+3;j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }
}
