package algorithm_baekjoon.croatia_alphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2941번 크로아티아 알파벳
public class Main {
    static String[] croatia_alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        for (int i=0;i<croatia_alphabet.length;i++) {
            String tmp  = croatia_alphabet[i];
            while (str.indexOf(tmp) != -1 && str.length() != 0) {
                str = str.substring(0,str.indexOf(tmp)) +" "+ str.substring(str.indexOf(tmp)+tmp.length());
                cnt++;
            }
        }
        str = str.replace(" ", "");
        System.out.println(cnt+str.length());


    }
}
