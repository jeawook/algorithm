package algorithm_baekjoon.word_count;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1152번 단어의 개수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String tmp  = br.readLine();
        int mok = tmp.length()/10;
        for (int i=0;i<mok;i++) {
            int range = i*10;
            sb.append(tmp.substring(range,range+10)+"\n");
        }
        sb.append(tmp.substring(mok*10,tmp.length()));

        System.out.println(sb.toString());

    }
}
