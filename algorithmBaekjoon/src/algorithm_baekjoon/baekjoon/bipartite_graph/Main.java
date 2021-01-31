package algorithm_baekjoon.baekjoon.bipartite_graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//1707번 이분 그래프
public class Main {
    static ArrayList<ArrayList<Integer>> list;
    static int[] colors;

    static final int RED = 1;
    static final int BLUE = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            colors = new int[V+1];
            for (int j = 0; j < V+1; j++) {
                list.add(new ArrayList<>());
            }
            while (E --> 0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                list.get(x).add(y);
                list.get(y).add(x);
            }
            boolean flag = true;
            for (int j = 1; j <= V; j++) {
                if (colors[j] == 0) {
                    if (!bfs(j, RED)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
    static boolean bfs(int x, int color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        colors[x] = color;
        while (!queue.isEmpty()) {
            int n = queue.poll();
            for (int i : list.get(n)) {
                if (colors[i] == 0 ) {
                    colors[i] = colors[n] * -1;
                    queue.offer(i);
                } else if (colors[i] == colors[n]){
                    return false;
                }
            }
        }
        return true;
    }
}
