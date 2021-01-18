package algorithm_baekjoon.baekjoon.maze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//2178번 미로탐색
public class Main {
    static int[][] arr;
    static boolean[][] visit;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][M+1];
        visit = new boolean[N+1][M+1];
        for (int i=1;i<=N;i++) {
            String[] tmp = br.readLine().split("");
            for (int j=1;j<=M;j++) {
                arr[i][j] = Integer.parseInt(tmp[j-1]);
            }
        }
        bfs(1,1);
        System.out.println(arr[N][M]);

    }
    static void bfs(int x, int y){
        Queue<Integer> q_x = new LinkedList<>();
        Queue<Integer> q_y = new LinkedList<>();
        visit[x][y] = true;
        q_x.offer(x);
        q_y.offer(y);

        while (!q_x.isEmpty()) {
            int cx = q_x.poll();
            int cy = q_y.poll();
            if (cx - 1 > 0) {
                if (arr[cx-1][cy] == 1 && !visit[cx-1][cy]) {
                    arr[cx-1][cy] = arr[cx][cy] + 1;
                    visit[cx-1][cy] = true;
                    q_x.offer(cx-1);
                    q_y.offer(cy);
                }
            }
            if (cy - 1 > 0) {
                if (arr[cx][cy-1] == 1 && !visit[cx][cy-1]) {
                    arr[cx][cy-1] = arr[cx][cy] + 1;
                    visit[cx][cy-1] = true;
                    q_x.offer(cx);
                    q_y.offer(cy-1);
                }
            }
            if (cx + 1 <= N) {
                if (arr[cx+1][cy] == 1 && !visit[cx+1][cy]) {
                    arr[cx+1][cy] = arr[cx][cy] + 1;
                    visit[cx+1][cy] = true;
                    q_x.offer(cx+1);
                    q_y.offer(cy);
                }
            }
            if (cy + 1 <= M) {
                if (arr[cx][cy+1] == 1 && !visit[cx][cy+1]) {
                    arr[cx][cy+1] = arr[cx][cy] + 1;
                    visit[cx][cy+1] = true;
                    q_x.offer(cx);
                    q_y.offer(cy+1);
                }
            }

        }
    }
}
