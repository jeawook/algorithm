package algorithm_baekjoon.baekjoon.recruit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//1946번 신입사원
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int[][] recruits;
        for (int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());

            recruits = new int[N][2];
            for (int j =0;j<N;j++) {
                st = new StringTokenizer(br.readLine());
                recruits[j][0] = Integer.parseInt(st.nextToken());
                recruits[j][1] = Integer.parseInt(st.nextToken());
            }
            Comparator<int[]> myComparator = new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            };
            Arrays.sort(recruits,myComparator);
            int pass = recruits[0][1];
            int cnt = 1;
            for (int j=1;j<N;j++) {
                if (pass > recruits[j][1]) {
                    cnt++;
                    pass = recruits[j][1];
                }
            }
            System.out.println(cnt);
        }
    }
}
