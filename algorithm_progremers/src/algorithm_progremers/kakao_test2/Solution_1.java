package algorithm_progremers.kakao_test2;

public class Solution_1 {

    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "tow", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i= 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        return answer;
    }
}
