package algorithm_baekjoon.dial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//5622번 다이얼
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        String[] dial = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV", "WXYZ"};
        int sum = 0;
        for (char tmp : arr){
            for (int i=0;i< dial.length;i++) {
                if (-1 != dial[i].indexOf(tmp)){
                    sum += i+3;
                }
            }
        }
        System.out.println(sum);
    }
}
