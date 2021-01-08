package algorithm_baekjoon.baekjoon.chessPaintig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1018번 체스판 다시 칠하기
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] chess = new String[size[0]][size[1]];
        for (int i=0;i<size[0];i++) {
            chess[i] = br.readLine().split("");
        }
        int N_size = size[0]-8;
        int M_size = size[1]-8;

        int max = 36;
        for (int i=0;i<=N_size;i++) {
            for (int j=0;j<=M_size;j++) {
                int tmp = check(chess,i,j);
                if (max > tmp) {
                    max = tmp;
                }
            }
        }
        System.out.println(max);
    }
    static int check(String[][] chess,int x, int y) {
        String[][] BForm = {{"B","W","B","W","B","W","B","W"},{"W","B","W","B","W","B","W","B"}
                ,{"B","W","B","W","B","W","B","W"},{"W","B","W","B","W","B","W","B"}
                ,{"B","W","B","W","B","W","B","W"},{"W","B","W","B","W","B","W","B"}
                ,{"B","W","B","W","B","W","B","W"},{"W","B","W","B","W","B","W","B"}
        };
        String[][] WForm = {{"W","B","W","B","W","B","W","B"},{"B","W","B","W","B","W","B","W"}
                ,{"W","B","W","B","W","B","W","B"},{"B","W","B","W","B","W","B","W"}
                ,{"W","B","W","B","W","B","W","B"},{"B","W","B","W","B","W","B","W"}
                ,{"W","B","W","B","W","B","W","B"},{"B","W","B","W","B","W","B","W"}
        };
        int BPainting = 0;
        int WPainting = 0;
        int form_i = 0;
        for (int i=x;i<x+8;i++) {
            int form_j=0;
            for (int j=y;j<y+8;j++){
                if (!chess[i][j].equals(BForm[form_i][form_j])){
                    BPainting++;
                }
                if (!chess[i][j].equals(WForm[form_i][form_j])) {
                    WPainting++;
                }
                form_j++;
            }
            form_i++;
        }
        return BPainting > WPainting ? WPainting : BPainting;
    }
}
