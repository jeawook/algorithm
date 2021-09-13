package algorithm_progremers.kakao_2022_test.programming_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        int n = 0;
        int k = 10;
        new Solution().solution(n, k);

    }

    public int solution(int n, int k) {
        int answer = 0;
        String conversion = conversion(n, k);
        char[] chars = conversion.toCharArray();
        String tmp = "";
        for (int i=0; i < chars.length; i++) {
            if (chars[i] != '0') {
                tmp += chars[i];
            }
            if ((i == chars.length-1 || chars[i] == '0' ) &&  !tmp.equals("")) {
                if (isPrime(Integer.parseInt(tmp))) {
                    answer++;
                }
                tmp = "";
            }
        }

        return answer;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++ ) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String conversion(int n, int k) {
        String tmp = "";
        int current = n;

        while(current > 0){
            if(current % k < 10){
                tmp = current % k + tmp;
            }
            current /= k;
        }
        return tmp;
    }
}
