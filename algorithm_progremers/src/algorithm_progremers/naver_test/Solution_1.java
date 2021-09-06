package algorithm_progremers.naver_test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution_1 {

    public static void main(String[] args) {
        int[] prices = {13000, 88000, 10000, 70000 , 80000};
        int[] discounts = {30, 20, 80};
        int solution = solution(prices, discounts);
        System.out.println(solution);
    }
    public static int solution(int[] prices, int[] discounts) {
        int answer = 0;
        Integer[] prices_arr = Arrays.stream(prices).boxed().toArray(Integer[]::new);
        Integer[] discounts_arr = Arrays.stream(discounts).boxed().toArray(Integer[]::new);
        Arrays.sort(prices_arr, Collections.reverseOrder());
        Arrays.sort(discounts_arr, Collections.reverseOrder());
        int n = Math.min(prices.length, discounts.length);
        for (int i=0; i < n; i++) {
            answer += prices_arr[i] - prices_arr[i] * ((double)discounts_arr[i] / 100);
        }
        if (prices.length > n) {
            for (int i=n; i <prices.length; i++ ) {
                answer += prices[i];
            }
        }
        return answer;
    }
}
