package algorithm_baekjoon.tile;

import java.io.*;
//3
//100
//001
//111

//4
// 5
//5
// 8
//1904번 01타일
//6
//000000
//000011
//001100
//110000
//100001
//001001
//100100
//111100
//110011
//001111
//111111
//100111
//111001

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] d = new int[x+3];

        d[0] = 0;
        d[1] = 1;
        d[2] = 2;
        for (int i = 3; i <=x; i++) {
            d[i] = d[i-1] + d[i-2];
            d[i] = d[i] %15746;
        }
        System.out.print(d[x]);

    }
}
