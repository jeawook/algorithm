package algorithm_baekjoon.sum_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1789번 수들의 합

/**
 *  1
 *  {1} : 1
 *  2
 *  {2} : 2
 *  3
 *  {1,2} : 2
 *  4
 *  {1,3} : 3
 *  10
 *  {1,2,3,4} : 4
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long S = Long.valueOf(br.readLine());

        Long left = 1L;
        Long right = 100000L;
        Long sum;
        while (left<right) {
            Long mid = (left+right)/2;
            sum = mid * (mid+1)/2;
            if (sum <= S) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(right -1 );
    }
}
