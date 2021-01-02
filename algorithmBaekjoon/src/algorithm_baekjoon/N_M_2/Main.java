package algorithm_baekjoon.N_M_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//15650번 N과M 2
public class Main {
    static int[] arr;
    static StringBuffer sb = new StringBuffer();
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        dfs(0,0);
        System.out.println(sb.toString());
    }
    static void dfs(int depth,int at) {
        if (M == depth) {
            for (int tmp : arr) {
                sb.append(tmp+" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = at; i<N;i++) {
            arr[depth] = i+1;
            dfs(depth+1, i+1);
        }

    }
}
