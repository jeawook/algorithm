package algorithm_baekjoon.baekjoon.change;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//5585번 거스름돈 2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] change = {500,100,50,10,5,1};
        n = 1000-n;
        int cnt = 0;
        for (int i=0;i< change.length;i++) {
            cnt += n/change[i];
            n %= change[i];
        }
        System.out.println(cnt);
    }
}
