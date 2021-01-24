package algorithm_baekjoon.baekjoon.tomato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//7576번 토마토
public class Main {
    static class Dot {
        int x;
        int y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[][] graph;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int M;
    static int N;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
    }
    static void bfs() {
        Queue<Dot> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] == 1) {
                    queue.offer(new Dot(i, j));
                    visit[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            Dot dot = queue.poll();
            int cx = dot.x;
            int cy = dot.y;
            for (int i = 0; i < dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (check(nx,ny)) {
                    if (graph[nx][ny] == 0 && !visit[nx][ny]) {
                        graph[nx][ny] = graph[cx][cy] + 1;
                        queue.offer(new Dot(nx, ny));
                        visit[nx][ny] = true;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }else{
                    max = Math.max(max, graph[i][j]);
                }
            }
        }
        System.out.println(max-1);

    }
    static boolean check(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < M;
    }
}
