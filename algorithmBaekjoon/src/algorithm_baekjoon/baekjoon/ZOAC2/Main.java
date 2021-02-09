package algorithm_baekjoon.baekjoon.ZOAC2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//18238번 ZOAC 2
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        char ch = 'A';
        int cnt = 0;
        for (int i = 0; i < arr.length; i++ ) {
            int a = 0;
            if (arr[i] > ch) {
                a = Math.min(arr[i] - ch, 'Z' - arr[i] + ch - 'A' + 1);
            } else {
                a = Math.min(ch - arr[i], 'Z' - ch + arr[i] - 'A' + 1);
            }
            ch = arr[i];
            cnt += a;
        }
        System.out.println(cnt);

    }
}
