package algorithm_baekjoon.baekjoon.electric_wire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2565번 전깃줄

/**
 * 1 3
 * 2 4
 * 3 1
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        int[][] wire = new int[n][2];

        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i=0;i<n;i++) {
            dp[i] = 1;
            for (int j=0;j<i;j++) {
                if (wire[i][1] > wire[j][1]){
                    dp[i] = Math.max(dp[i],dp[j]+1 );
                }
            }
        }

        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(n - max);

    }
}
