package algorithm_progremers.naver_test;

public class Solution_2 {

    public static void main(String[] args) {
        String s = "aabcbcd";
        String t = "abc";
        /*s = "abababab";
        t = "ab";*/
        int solution = solution(s, t);
        System.out.println(solution);
        int result = 2;

    }

    public static int solution(String s, String t) {
        int result = 0;

        while (s.contains(t)) {
            int i = s.indexOf(t);
            s = s.replaceFirst(t, "");
            result++;
        }
        return result;
    }
}
