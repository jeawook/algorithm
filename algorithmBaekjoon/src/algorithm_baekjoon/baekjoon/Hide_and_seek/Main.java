package algorithm_baekjoon.baekjoon.Hide_and_seek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//1697번 숨바꼭질
public class Main {
    static int K;
    static int[] visit = new int[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        bfs(N);
    }
    static void bfs(int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        visit[N] = 1;
        while (!queue.isEmpty()) {
            int n = queue.poll();

            if (n != K) {
                    if (n - 1 >= 0 && visit[n-1] == 0) {
                        visit[n - 1] = visit[n] + 1;
                        queue.add(n - 1);
                    }
                    if (n + 1 <= 100000 && visit[n+1] == 0) {
                        visit[n+1] = visit[n] + 1;
                        queue.add(n + 1);
                    }
                    if (n * 2 <= 100000 && visit[n*2] == 0){
                        visit[n*2] = visit[n] + 1;
                        queue.add(n * 2);
                    }
            } else {
                System.out.println(visit[K]-1);
                break;
            }
        }

    }
}
