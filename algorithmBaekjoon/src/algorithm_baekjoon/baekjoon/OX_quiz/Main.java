package algorithm_baekjoon.baekjoon.OX_quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8958번 OX퀴즈
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        String str;
        for (int i = 0; i < T; i++ ) {
            int point = 0;
            int sum = 0;
            str = br.readLine();
            for (int j=0;j<str.length();j++) {
                char ch = str.charAt(j);
                if (ch == 'O') {
                    point++;
                    sum += point;
                }else if (ch == 'X') {
                    point = 0;
                }
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb.toString());
    }
}
