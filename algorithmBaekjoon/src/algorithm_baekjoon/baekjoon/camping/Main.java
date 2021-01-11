package algorithm_baekjoon.baekjoon.camping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//4796번 캠핑
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i=1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int days = 0;
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L == 0 && P == 0 && V == 0) {
                return;
            }
            days = V / P * L;
            days += Math.min(V % P, L);
            System.out.printf("Case %d: %d\n",i++,days);
        }

    }
}
