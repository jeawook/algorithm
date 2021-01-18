package algorithm_baekjoon.baekjoon.virus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2606번 바이러스
public class Main {
    static List<LinkedList<Integer>> list;
    static boolean[] visit;
    static int cnt = 0;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        visit = new boolean[N];
        list = new LinkedList<>();
        for (int i=0;i<N;i++) {
            list.add(new LinkedList<>());
        }
        for (int i=0;i<M;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.get(x-1).add(y-1);
            list.get(y-1).add(x-1);
        }
        bfs(0);
        System.out.println(cnt);
    }
    static void bfs(int n) {
        visit[n] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        while (!queue.isEmpty()) {

            int x = queue.poll();
            LinkedList<Integer> linkedList = list.get(x);

            for (int y : linkedList) {
                if (!visit[y]){
                    cnt++;
                    visit[y] = true;
                    queue.offer(y);
                }
            }
        }
    }
}
