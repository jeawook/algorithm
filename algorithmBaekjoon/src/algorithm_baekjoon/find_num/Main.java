package algorithm_baekjoon.find_num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1920번 수 찾기
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        int [] findLIst = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(list);

        for (int i=0; i < M;i++) {
            int num = findLIst[i];
            int left = 0;
            int right = N-1;
            boolean flag = true;
            while (left <= right) {
                int mid = (left+right)/2;
                int midValue = list[mid];
                if (num < midValue) {
                    right = mid -1;
                } else if(num > midValue) {
                    left = mid + 1;
                } else {
                    flag = false;
                    System.out.println("1");
                    break;
                }
            }
            if (flag)
            System.out.println("0");
        }



    }
}
