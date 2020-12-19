package algorithm_baekjoon.RGB_street;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1149번 RGB 거리
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] price = new int[num][3];
        for (int i=0;i<num;i++) {
            price[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }


        for (int i=1;i<num;i++) {
            price[i][0] += Math.min(price[i-1][1],price[i-1][2]);
            price[i][1] += Math.min(price[i-1][0],price[i-1][2]);
            price[i][2] += Math.min(price[i-1][0],price[i-1][1]);
        }

        System.out.println(Math.min(price[num-1][0], Math.min(price[num-1][1], price[num-1][2] ) ));
    }
}
