package algorithm_baekjoon.baekjoon.wine_tasting;

//2156번 포도주 시식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
 * 연속으로 놓여 있는 3잔을 모두 마실 수는 없다.
 * 첫째 줄에 포도주 잔의 개수 n이 주어진다.
 * (1≤n≤10,000) 둘째 줄부터 n+1번째 줄까지 포도주 잔에 들어있는 포도주의 양이 순서대로 주어진다. 포도주의 양은 1,000 이하의 음이 아닌 정수이다.
 * input 6, 10, 13, 9, 8, 1
 * output 33
 * input 6, 10, 13
 * output 23
 */
public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[] d = new int[10001];
        int[] wine = new int[10001];
        for (int i=1;i<=n;i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        d[1] = wine[1];
        if (n > 1) {
            d[2] = d[1] + wine[2];
        }
        if (n > 2) {
            d[3] = Math.max(d[2] ,Math.max(d[1] + wine[3], wine[2] + wine[3] ));
        }

        for (int i=4;i<=n;i++) {
            d[i] = Math.max(d[i-1] , Math.max(d[i-2] + wine[i],d[i-3]+wine[i]+wine[i-1]));
        }


        System.out.println(d[n]);
    }
}
