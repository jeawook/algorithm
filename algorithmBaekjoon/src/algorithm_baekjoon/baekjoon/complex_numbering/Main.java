package algorithm_baekjoon.baekjoon.complex_numbering;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//2667번 단지번호붙이기
public class Main {
    static char[][] graph;
    static boolean[][] visit;
    static int apart = 0;
    static int N;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        N = Integer.parseInt(br.readLine());
        graph = new char[N][N];
        visit = new boolean[N][N];
        int group = 0;
        for (int i=0;i<N;i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j=0;j<N;j++) {
                graph[i][j] = chars[j];
            }
        }

        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                if (!visit[i][j] && graph[i][j] == '1') {
                    //dfs(i,j);
                    bfs(i,j);
                    pq.add(apart);
                    apart = 0;
                    group++;
                }
            }
        }
        System.out.println(group);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
    static void bfs(int x, int y) {
        Queue<Integer> q_x = new LinkedList<>();
        Queue<Integer> q_y = new LinkedList<>();
        q_x.offer(x);
        q_y.offer(y);

        visit[x][y] = true;
        apart++;
        while (!q_x.isEmpty()) {
            int cx = q_x.poll();
            int cy = q_y.poll();
            for (int i=0;i<dx.length;i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (check(nx,ny)) {
                    if (!visit[nx][ny] && graph[nx][ny] == '1') {
                        q_x.offer(nx);
                        q_y.offer(ny);
                        apart++;
                        visit[nx][ny] = true;
                    }
                }
            }
        }
    }
    static void dfs(int x, int y) {
        visit[x][y] = true;
        apart++;
        for (int i=0;i<dx.length;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (check(nx,ny) && !visit[nx][ny] && graph[nx][ny] == '1') {
                dfs(nx,ny);
            }
        }

    }
    static boolean check(int x, int y) {
        return x >= 0 && y >= 0 && y < N && x < N;
    }
}
