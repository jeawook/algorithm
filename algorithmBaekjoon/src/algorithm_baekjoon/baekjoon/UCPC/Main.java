package algorithm_baekjoon.baekjoon.UCPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//15904번 UCPC는 무엇의 약자일까?
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] tmp = {'U','C','P','C'};
        String str = br.readLine();
        str = str.replaceAll("[a-z\\s]", "");
        int j=0;
        for (int i=0;i<str.length();i++) {
            if (tmp[j] == str.charAt(i)) {
                j++;
                if (j == 4) {
                    break;
                }
            }
        }
        if (j == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }

    }
}
