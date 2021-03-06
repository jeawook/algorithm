package algorithm_baekjoon.baekjoon.N_M_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//15651 번 N 과 M 3
public class Main {
    static int[] arr;
    static int N;
    static int M;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        dfs(0);
        System.out.println(sb.toString());
    }
    static void dfs(int depth) {
        if (M ==depth) {
            for (int tmp : arr) {
                sb.append(tmp+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=0;i<N;i++) {
            arr[depth] = i+1;
            dfs(depth+1);
        }
    }
}
