package algorithm_baekjoon.baekjoon.flip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1439번 뒤집기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] cnt = new int[2];
        char ch = str.charAt(0);
        cnt[ch - '0']++;
        for (int i=1; i<str.length();i++) {
            char t = str.charAt(i);
            if (ch != t) {
                ch = t;
                cnt[ch - '0']++;
            }
        }
        System.out.println(Math.min(cnt[0], cnt[1]));
    }
}
