package algorithm_progremers.compaction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        String msg = "KAKAO";
        Solution solution = new Solution();
        solution.solution(msg);
    }

    public int[] solution(String msg) {
        LinkedList<Integer> arr = new LinkedList<>();
        String[] strings = {"A","B","C","D","E","F","G","H","I","J","K","L","N","M","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], i+1);

        }

        for (int i = 0; i < msg.length(); i++) {
            int ptr = 1;
            int location = -1;
            while (location != 0 && i + ptr < msg.length()) {
                ptr++;
                location = map.getOrDefault(msg.substring(i, i+ptr), 0);
                System.out.println("location = " + location);
            }
            
            String str = msg.substring(i, i+ptr);
            System.out.println("str = " + str);
            int t = map.get(str);
            arr.add(t);
            if (ptr > 2) {
                i++;
            }
        }
        System.out.println("arr.size() = " + arr.size());
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.remove();
            System.out.println("answer = " + answer[i]);
        }
        return answer;
    }
}
