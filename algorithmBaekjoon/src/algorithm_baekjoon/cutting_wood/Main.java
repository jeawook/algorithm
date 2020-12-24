package algorithm_baekjoon.cutting_wood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

//2805번 나무 자르기
public class Main {

    public static void main(String[] args) {
       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int value  = sc.nextInt();
        int[] list = new int[n];
        Long max = 0L;
        for (int i=0;i<n;i++) {
            list[i] = sc.nextInt();
            max = Math.max(max, list[i]);
        }

        Long left = 0L;
        Long right = max;
        while (left <= right) {
            Long mid = (left+right)/2;
            Long sum = 0L;
            for (int tmp : list) {
                if (tmp > mid) {
                    sum += tmp-mid;
                }
            }
            if (sum >= value ) {
                left = mid +1;
            }else{
                right = mid -1;
            }

        }
        System.out.println(right);
    }
}
