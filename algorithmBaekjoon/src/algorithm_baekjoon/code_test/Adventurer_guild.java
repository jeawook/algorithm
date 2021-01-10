package algorithm_baekjoon.code_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Adventurer_guild {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i=0;i < N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        int group = 0;
        for (int i=0;i<N;i++) {
            count++;
            if (count >= arr[i]) {
                group++;
                count = 0;
            }
        }
        System.out.println(group);
    }
}
