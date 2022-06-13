package algorithm_progremers.progremers_test;

public class Solution2 {

    public static void main(String[] args) {
        //int rows = 6;
        int rows = 3;
        //int columns = 6;
        int columns = 3;
        //int[][] queries = {{2,2,5,4}, {3,3,6,6}, {5,1,6,3}};
        int[][] queries = {{1,1,2,2}, {1,2,2,3}, {2,1,3,2}, {2,2,3,3}};
        Solution2 solution2 = new Solution2();
        int[] solution = solution2.solution(rows, columns, queries);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][]  list = new int[rows][columns];
        int n = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                list[i][j] = n;
                n++;
            }
        }
        int min = 0;

        for (int i= 0 ; i< queries.length; i++) {
            answer[i] = solve(queries[i], list);
        }


        return answer;
    }
    static int solve(int[] queries, int[][] list) {
        int x1 = queries[0]-1; //2
        int y1 = queries[1]-1; //2
        int x2 = queries[2]-1; //5
        int y2 = queries[3]-1; //4
        int pre = list[x1+1][y1];
        int min = list[x1+1][y1];
        int now;
        for (int i = y1; i <= y2; i++) {

            now = list[x1][i];
            min = Math.min(min, now);
            list[x1][i] = pre;
            pre = now;
        }
        for (int i = x1+1; i <= x2; i++) {
            now = list[i][y2];
            min = Math.min(min, now);
            list[i][y2] = pre;
            pre = now;
        }
        for (int i = y2-1; i >= y1; i--) {
            now = list[x2][i];
            min = Math.min(min, now);
            list[x2][i] = pre;
            pre = now;
        }
        for (int i = x2-1; i >= x1; i--) {
            now = list[i][y1];
            min = Math.min(min, now);
            list[i][y1] = pre;
            pre = now;
        }
        return min;
    }
}
