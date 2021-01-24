import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//1012번 유기농 배추
public class Main {
    static int[][] graph;
    static boolean[][] visit;
    static int M;
    static int N;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            graph = new int[M][N];
            visit = new boolean[M][N];
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
            }
            for (int j = 0; j < M;j++) {
                for (int k = 0; k < N; k++) {
                    if (graph[j][k] == 1 && !visit[j][k]) {
                        cnt++;
                        bfs(j,k);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    static void bfs(int x, int y) {
        Queue<Integer> q_x = new LinkedList<>();
        Queue<Integer> q_y = new LinkedList<>();
        q_x.offer(x);
        q_y.offer(y);
        visit[x][y] = true;
        while (!q_x.isEmpty()) {
            int cx = q_x.poll();
            int cy = q_y.poll();
            for (int i = 0; i < dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (check(nx,ny)) {
                    if (graph[nx][ny] == 1 && !visit[nx][ny]) {
                        q_x.offer(nx);
                        q_y.offer(ny);
                        visit[nx][ny] = true;
                    }
                }
            }

        }
    }
    static boolean check(int x, int y) {
        return x >= 0 && y >= 0 && x < M && y <  N;
    }
}
