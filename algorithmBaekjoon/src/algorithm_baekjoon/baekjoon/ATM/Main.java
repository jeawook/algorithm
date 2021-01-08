package algorithm_baekjoon.baekjoon.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//11399번 ATM
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int total = 0;
        int sum = 0;
        int[] time = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(time);
        for (int tmp : time){
            total += (sum+tmp);
            sum += tmp;
        }
        System.out.println(total);
    }
}
