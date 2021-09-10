package algorithm_progremers.kakao_2021.menu_renewal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    static HashSet<String> set = new HashSet<>();
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();

        for (String arr : orders) {
            String[] split = arr.split("");
            for (String str : split) {
                set.add(str);
            }
        }
        while (!set.isEmpty()) {

        }
        return answer;
    }

    public int resolve(String str,int ptr, int n) {
        if () {

        }

        return resolve();
    }
}
