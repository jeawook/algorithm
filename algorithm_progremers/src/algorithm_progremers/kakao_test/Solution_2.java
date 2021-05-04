package algorithm_progremers.kakao_test;

public class Solution_2 {

    public static void main(String[] args) {
        int[][] needs = {
                {1, 0, 0},
                {1, 1, 0},
                {1, 1, 0},
                {1, 0, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        int r = 2;
        Solution_2 solution_2 = new Solution_2();
        solution_2.solution(needs, r);

    }
    static int max = 0;
    public int solution(int[][] needs, int r) {
        int answer = 0;
        boolean[] visited = new boolean[needs[0].length];
        int i = 0;
        solve(needs,visited, i, needs[0].length, r);
        answer = max;
        return answer;
    }

    static void solve(int[][] needs, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            int cnt = 0;
            for (int i =0; i < needs.length; i++ ) {
                boolean flag = true;
                for (int j = 0; j < visited.length; j++) {
                    if (!visited[j] && needs[i][j] == 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    cnt ++;
                }
            }
            max = Math.max(cnt, max);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            solve(needs,visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }


}
