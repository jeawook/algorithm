package algorithm_baekjoon.baekjoon.moving_walls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//2206번 벽 부수고 이동하기
public class Main {
    static char[][] graph;
    static boolean[][][] visit;
    static int N;
    static int M;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static class Location {
        int x;
        int y;
        int cnt;
        int jump;

        public Location(int x, int y, int cnt, int jump) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.jump = jump;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new char[N][M];
        visit = new boolean[2][N][M];
        for (int i = 0; i < N; i++) {
            graph[i] = br.readLine().toCharArray();
        }
        bfs();
        /*for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(visit[0][i][j]);
            }
            System.out.println();
        }*/

    }
    static void bfs() {
        Queue<Location> queue = new LinkedList<>();
        queue.offer(new Location(0, 0, 1, 0));
        visit[0][0][0] = true;
        visit[1][0][0] = true;
        while (!queue.isEmpty()) {
            Location location = queue.poll();
            int cx = location.x;
            int cy = location.y;
            int cnt = location.cnt;
            int jump = location.jump;

            if (cx == N - 1 && cy == M - 1) {
                System.out.println(cnt);
                return;
            }

            for (int i = 0; i < dx.length; i++) {

                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (check(nx, ny)) {
                    if (graph[nx][ny] == '1') {
                        if (jump == 0 && !visit[1][nx][ny]) {
                            visit[1][nx][ny] = true;
                            queue.offer(new Location(nx, ny, cnt+1, 1));
                        }
                    } else {
                        if (!visit[jump][nx][ny]) {
                            visit[jump][nx][ny] = true;
                            queue.offer(new Location(nx, ny, cnt+1, jump));
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
    static boolean check(int x, int y) {
        return (x >= 0 &&  x < N) && (y >= 0 && y <  M);
    }
}
