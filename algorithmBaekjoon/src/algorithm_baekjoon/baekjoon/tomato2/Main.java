package algorithm_baekjoon.baekjoon.tomato2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//7569번 토마토
public class Main {
    static int[][][] graph;
    static boolean[][][] visit;
    static int N;
    static int M;
    static int H;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[] dz = {1, -1};


    static class Node {
        int x;
        int y;
        int z;

        public Node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        graph = new int[H][N][M];
        visit = new boolean[H][N][M];
        for (int i = 0; i < H;i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0 ; k < M; k ++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        bfs();
    }
    static void bfs(){
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < H;i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0 ; k < M; k ++) {
                    if (graph[i][j][k] == 1) {
                        queue.offer(new Node(j, k, i));
                        visit[i][j][k] = true;
                    }
                }
            }
        }
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int cx = node.x;
            int cy = node.y;
            int cz = node.z;
            for (int i=0; i < dx.length; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (check(nx, ny, cz)) {
                    if (graph[cz][nx][ny] == 0 && !visit[cz][nx][ny]) {
                        visit[cz][nx][ny] = true;
                        graph[cz][nx][ny] = graph[cz][cx][cy] + 1;
                        queue.offer(new Node(nx, ny, cz));
                    }
                }
            }
            for (int i=0; i < dz.length; i++) {
                int nz = cz + dz[i];
                if (check(cx, cy, nz)) {
                    if (graph[nz][cx][cy] == 0 && !visit[nz][cx][cy]) {
                        visit[nz][cx][cy] = true;
                        graph[nz][cx][cy] = graph[cz][cx][cy] + 1;
                        queue.offer(new Node(cx, cy, nz));
                    }
                }

            }

        }
        int max = 0;
        for (int i = 0; i < H;i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0 ; k < M; k ++) {
                    if (graph[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    } else {
                      max = Math.max(max, graph[i][j][k]);
                    }
                }
            }
        }
        System.out.println(max-1);

    }
    static boolean check(int x, int y, int z){
        return x >= 0 && y >= 0 && z >= 0 && x < N && y < M && z < H;
    }
}
