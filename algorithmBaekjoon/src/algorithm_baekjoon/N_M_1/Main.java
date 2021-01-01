package algorithm_baekjoon.N_M_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//15649번 N과M 1
public class Main {
    static int[] arr;
    static boolean[] visit;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visit = new boolean[N];
        dfs(N,M,0, 0);
        System.out.println(sb.toString());
    }
    static void dfs(int N, int M, int depth,int at) {
        if (M == depth) {
            for (int tmp : arr) {
                sb.append(tmp+" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=at;i<N;i++) {
            arr[depth] = i+1;
            dfs(N,M,depth+1, i+1);
        }

    }
}
