package algorithm_baekjoon.budget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//2512번 예산
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] budgetList = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0;i<N;i++) {
            budgetList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(budgetList);
        int budget = Integer.parseInt(br.readLine());
        int left = 1;
        int right = budgetList[N-1];
        while (left <= right) {
            int mid = (left+right)/2;
            int sum = 0;
            for (int tmp : budgetList) {
                if (mid >= tmp) {
                    sum += tmp;
                } else {
                  sum += mid;
                }
            }
            if (sum <= budget) {
                left = mid + 1;
            }else if (sum > budget) {
                right = mid -1;
            }
        }
        System.out.println(right);

    }
}
