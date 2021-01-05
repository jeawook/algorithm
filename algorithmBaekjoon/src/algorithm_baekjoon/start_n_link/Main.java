package algorithm_baekjoon.start_n_link;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//14889번 스타트와 링크
public class Main {
    static int[][] arr;
    static boolean[] member;
    static int N;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        member = new boolean[N];
        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(Min);
    }
    static void dfs(int depth, int cnt) {

        if (cnt == N/2){

            diff();
            return;
        }
        for (int i=depth;i<N;i++) {
            if (!member[i]) {
                member[i] = true;
                dfs(i +1,cnt+1);
                member[i] = false;
            }
        }
    }
    static void diff() {
        int start = 0;
        int link = 0;
        for (int i=0;i<N-1;i++) {
            for (int j=i+1;j<N;j++) {
                if (member[i] && member[j]) {
                    start += arr[i][j];
                    start += arr[j][i];
                } else if (!member[i] && !member[j]) {
                    link += arr[i][j];
                    link += arr[j][i];
                }
            }
        }
        int n =  Math.abs( start - link );
        if (n == 0) {
            System.out.println(0);
            System.exit(0);
        }

        Min = Math.min(n, Min);
    }
}
