package algorithm_baekjoon.baekjoon.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1260번 DFS와 BFS
public class Main2 {
    static List<LinkedList<Integer>> arr;
    static boolean[] visit;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visit = new boolean[N];
        arr = new ArrayList<>();
        for (int i=0;i<N;i++) {
            arr.add(new LinkedList<>());
        }
        for (int i=0;i<M;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.get(x-1).add(y-1);
            arr.get(y-1).add(x-1);
        }
        for (int i=0;i<N;i++) {
            Collections.sort(arr.get(i));
        }
        dfs(V-1);
        System.out.println(sb.toString());
        sb = new StringBuffer();
        visit = new boolean[N];
        bfs(V-1);
        System.out.println(sb.toString());

    }
    static void dfs(int x){
        visit[x] = true;
        sb.append(x+1).append(" ");
        for (int i : arr.get(x)) {
            if (!visit[i]) {
                dfs(i);
            }
        }
    }
    static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visit[x] = true;
        while(!queue.isEmpty()) {
            int i = queue.poll();
            sb.append(i+1).append(" ");
            for (int y : arr.get(i)) {
                if (!visit[y]) {
                    visit[y] = true;
                    queue.offer(y);
                }
            }
        }
    }
}
