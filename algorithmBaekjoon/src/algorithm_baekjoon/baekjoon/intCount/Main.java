package algorithm_baekjoon.baekjoon.intCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2577번 숫자의 개수
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[]  values = new int[3];
        for (int i=0;i<3;i++){
            values[i] = Integer.parseInt(br.readLine());
        }
        Long sum =1L;
        for (int value : values){
            sum *=value;
        }
    }
}
