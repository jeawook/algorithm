package algorithm_baekjoon.alphabetFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10809번 알파벳 찾기
public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int value = 97;
        for (int i=0;i<26;i++){
            System.out.print(word.indexOf((char)value)+" ");
            value++;
        }
    }
}
