package algorithm_baekjoon.baekjoon.polyomino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1343번 폴리오미노
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String board = br.readLine();
        String answer = "";
        int start = 0;
        int end = board.indexOf(".");
        boolean point = false;
        if (end != -1) {
            point = true;
        }
        while(answer.length() < board.length()) {
            int n = (end - start)%4;
            int k = (end - start)/4;

            for (int i=0;i<k;i++) {
                answer += "AAAA";
            }

            if (n == 2) {
                answer += "BB";
            }
            if (point) {
                answer += ".";
            }
            if (n == 3 || n ==1) {
                System.out.println(-1);
                return;
            }
            start = end+1;
            end = board.indexOf(".",start);
            if (end == -1) {
                point = false;
                end = board.length();
            }
        }
        System.out.println(answer);


    }
}
