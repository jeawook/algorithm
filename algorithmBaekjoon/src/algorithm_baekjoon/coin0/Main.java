package algorithm_baekjoon.coin0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 11047번 동전 0
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] command = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] coinList = new int[command[0]];
        int cnt = 0;
        for (int i=0;i<command[0];i++){
            coinList[i] = Integer.parseInt(br.readLine());
        }
        for (int i=command[0]-1;i>=0;i--){
            int value =command[1] / coinList[i];
            if (value > 0){
                cnt += value;
                command[1]  -= (value * coinList[i]);
            }
            if (command[1] == 0){
                break;
            }
        }
        System.out.println(cnt);
    }
}
