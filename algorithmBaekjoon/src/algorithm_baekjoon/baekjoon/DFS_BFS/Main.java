package algorithm_baekjoon.baekjoon.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 1260번 DFS와 BFS
public class Main {
    static int[][] list;
    static boolean[] visit;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        list = new int[N+1][N+1];
        visit = new boolean[N+1];
        for (int i=1;i<=M;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x][y] = list[y][x] = 1;
        }
        dfs(V);
        visit = new boolean[N+1];

        System.out.println();
        bfs(V);

    }
    static void dfs(int x){
        visit[x] = true;
        System.out.print(x +" ");
        for (int i=1; i<=N;i++) {
            if (list[x][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
    static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visit[x] = true;
        while (!queue.isEmpty()) {
            int t = queue.poll();
            System.out.print(t +" ");
            for (int i = 1; i <=N; i++) {
                if (list[t][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] =true;
                }
            }
        }
    }
}
