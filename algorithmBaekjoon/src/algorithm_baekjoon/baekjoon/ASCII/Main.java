package algorithm_baekjoon.baekjoon.ASCII;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11654번 아스키 코드
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ch = br.readLine();
        System.out.println(ch.charAt(0) - 0);

    }
}
