package algorithm_progremers.compaction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[] solution(String msg) {
        int[] answer = new int[msg.length()];

        String[] strings = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 1; i <= strings.length; i++) {
            map.put(strings[i], i);

        }
        for (int i = 0; i < msg.length()-1; i++) {
            int location = map.getOrDefault(msg.substring(i, i + 1), 0);
            if (location == 0) {

            }
        }


        return answer;
    }
}
