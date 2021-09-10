package algorithm_progremers.kakao_2021.tuple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        new Solution().solution(s);
    }

    public int[] solution(String s) {

        String split = "},\\{";
        String replace_s = s.replace("{{", "").replace("}}", "");
        String[] result = replace_s.split(split);

        HashMap<Integer, Integer> arr = new HashMap<>();
        for (String tmp : result) {
            for (String tmp2 : tmp.split(",")) {
                int num = Integer.parseInt(tmp2);
                arr.put(num, arr.getOrDefault(num, 0)+1);
            }
        }
        int[] answer = new int[arr.size()];
        int j = 0;
        while (!arr.isEmpty()) {
            int max = 0;
            int key = 0;
            for (Integer num : arr.keySet()) {
                if (max < arr.get(num)) {
                    key = num;
                    max = arr.get(num);
                }
            }
            arr.remove(key);
            answer[j] = key;
            j++;
        }

        return answer;
    }
}
