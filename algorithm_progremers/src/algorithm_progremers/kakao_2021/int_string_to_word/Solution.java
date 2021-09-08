package algorithm_progremers.kakao_2021.int_string_to_word;

public class Solution {

    public int solution(String s) {
        int answer = 0;

        String[] int_word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i=0; i<= int_word.length; i++) {
            s = s.replaceAll(int_word[i], ""+i);
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}
