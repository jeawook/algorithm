package algorithmBook.basic;

import java.util.ArrayList;

public class Example_1 {
    static int[][] ice;
    static int n;
    static int m;
    public static void main(String[] args) {
        n = 4;
        m = 5;
        ice = new int[][]{{0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};
        int result = 0;
        for (int i=0; i < n; i++) {
            for (int j=0; j < m; j++) {
                if (ice[i][j] == 0) {
                    if (dfs(i,j))
                       result++;
                }
            }
        }
        System.out.println("result = " + result);
    }

    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m)
            return false;
        if (ice[x][y] == 0) {
            ice[x][y] =1;
            dfs(x - 1, y);
            dfs(x, y-1);
            dfs(x+1, y);
            dfs(x, y+1);
            return true;
        }
        return false;

    }
}
