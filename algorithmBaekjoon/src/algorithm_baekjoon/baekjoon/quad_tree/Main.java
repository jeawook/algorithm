package algorithm_baekjoon.baekjoon.quad_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1992번 쿼드 트리
public class Main {
    static int[][] arr;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i=0;i<N;i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        quadTree(0,0, N);
        System.out.println(sb.toString());
    }
    static void quadTree(int x, int y, int n) {
        int p = arr[x][y];
        boolean flag = false;
        for (int i=x;i<x+n;i++) {
            for (int j=y;j<y+n;j++){
                if (p != arr[i][j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                sb.append("(");
                quadTree(x, y,n/2);
                quadTree(x,y+n/2, n/2);
                quadTree(x+n/2,y,n/2);
                quadTree(x+n/2, y+n/2, n/2);
                sb.append(")");
                break;
            }
        }
        if (!flag) {
            sb.append(p);
        }
    }
}
