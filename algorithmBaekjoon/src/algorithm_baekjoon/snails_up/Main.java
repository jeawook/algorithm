package algorithm_baekjoon.snails_up;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2869번 달팽이는 올라가고 싶다

/**
 * 100 99 1000000000
 * 100 98 1000000000
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A >= C) {
            System.out.println(1);
            return;
        }
        int end = C - A;
        int up =  A - B;
        int cnt = end/up;
        int na = end%up;
        if (na == 0) {
            cnt++;
        } else {
            cnt += 2;
        }

        System.out.println(cnt);
    }
}
