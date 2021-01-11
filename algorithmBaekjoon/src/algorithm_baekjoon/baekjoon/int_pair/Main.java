package algorithm_baekjoon.baekjoon.int_pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1744번 수 묶기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Long sum = 0L;
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int left = 0;
        int right = N-1;
        for (; left < right; left += 2) {
            if (arr[left] < 1 && arr[left + 1] < 1) {
                sum  += arr[left] * arr[left + 1];
            } else {
                break;
            }
        }
        for (; right > 0; right -= 2) {
            if (arr[right] >1 && arr[right-1] > 1) {
                sum += arr[right] * arr[right-1];
            } else {
              break;
            }
        }
        for (; left <= right; left++) {
            sum += arr[left];
        }

        System.out.println(sum);
    }
}
