package algorithm_baekjoon.baekjoon.rope;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//2217번 로프
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for ( int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i=0;i<N;i++) {
            if (max < arr[i] * (N-i)) {
                max = arr[i] * (N-i);
            }
        }
        System.out.println(max);
    }
}
