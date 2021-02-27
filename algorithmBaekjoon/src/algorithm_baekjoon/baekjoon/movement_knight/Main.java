package algorithm_baekjoon.baekjoon.movement_knight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//7562번 나이트의 이동
public class Main {
    static int[][] graph;
    static boolean[][] visit;
    static int N;
    static int[][] move = {{-2,-1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};
    static int[] target;
    static class Knight{
        int x;
        int y;
        int cnt;

        public Knight(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            graph = new int[N][N];
            visit = new boolean[N][N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] knights = new int[2];
            knights[0] = Integer.parseInt(st.nextToken());
            knights[1] = Integer.parseInt(st.nextToken());
            target = new int[2];
            st = new StringTokenizer(br.readLine());
            target[0] = Integer.parseInt(st.nextToken());
            target[1] = Integer.parseInt(st.nextToken());
            bfs(knights[0], knights[1] );
        }
    }
    static void bfs(int x, int y) {
        Queue<Knight> queue = new LinkedList<>();
        queue.offer(new Knight(x, y, 0));
        visit[x][y] = true;
        while (!queue.isEmpty()) {
            Knight knight = queue.poll();
            int cx = knight.x;
            int cy = knight.y;
            int cnt  = knight.cnt;

            if (cx == target[0] && cy == target[1]) {
                System.out.println(cnt);
                return;
            }

            for (int i=0; i < move.length; i++) {
                int nx = cx + move[i][0];
                int ny = cy + move[i][1];
                if (check(nx, ny)){

                    if (!visit[nx][ny]) {
                        visit[nx][ny] = true;
                        queue.offer(new Knight(nx, ny, cnt +1));
                    }
                }
            }
        }
    }
    static boolean check(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}
