package algorithm_baekjoon.statistical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2018번 통계학
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[] counting = new int[10001];
        for(int i=0;i<num;i++){
            counting[Integer.parseInt(br.readLine())]++;
        }

        for (int i=0;i< counting.length;i++){
            for (int j=0;j<counting[i];j++){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb.toString());


    }
}
