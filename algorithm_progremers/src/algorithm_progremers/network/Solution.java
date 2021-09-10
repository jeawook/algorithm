package algorithm_progremers.network;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        //int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
        int[][] computers = {{1,1,0}, {1,1,1}, {0,1,1}};
        int solution = solution(n, computers);
        System.out.println("solution = " + solution);

    }
    static boolean[] visited;
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length];
        for (int i=0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, computers);
                answer++;
            }
        }
        return answer;
    }
    public static void bfs(int x, int[][] computers) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(x);

        while (!q.isEmpty()) {
            int y = q.remove();
            visited[y] = true;
            for (int i=0; i < computers[y].length; i++) {
                if (y != i && computers[y][i] == 1 && !visited[i]) {
                    q.offer(i);
                }
            }
        }

    }
    
}
