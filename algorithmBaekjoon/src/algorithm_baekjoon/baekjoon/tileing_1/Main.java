package algorithm_baekjoon.baekjoon.tileing_1;

//11726번 타일링

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        d = new int[N+1];
        System.out.println(search(N));

    }
    static int search(int n) {
        if(n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (d[n] != 0) {
            return d[n];
        }
        d[n] = (search(n -1) + search(n-2)) % 10007;

        return d[n];
    }
}
