package algorithm_baekjoon.baekjoon.intSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 11720번 숫자의 합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int x : list)
            sum+=x;
        System.out.println(sum);
    }
}
