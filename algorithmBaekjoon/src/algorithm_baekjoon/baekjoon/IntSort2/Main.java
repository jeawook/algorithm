package algorithm_baekjoon.baekjoon.IntSort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2751번 수 정렬하기 2
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];

        for (int i=0;i<num;i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);

        for (int x : list){
            sb.append(x+"\n");
        }
        System.out.println(sb.toString());
    }
}
