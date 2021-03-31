package algorithm_progremers.compaction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        //String msg = "KAKAO";
        String msg = "ABABABABABABABAB";
        //String msg = "TOBEORNOTTOBEORTOBEORNOT";
        Solution solution = new Solution();
        solution.solution(msg);
    }

    public int[] solution(String msg) {
        LinkedList<Integer> arr = new LinkedList<>();
        String[] strings = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], i+1);

        }

        for (int i = 0; i < msg.length(); i++) {

            for(int j= 0; i+j < msg.length(); j++) {
                String tmp = msg.substring(i, j + i + 1);
                int length = msg.length();
                int location = map.getOrDefault(tmp, 0);
                if (location == 0 ) {
                    arr.add(map.get(msg.substring(i,j+i)));
                    map.put(tmp, map.size()+1);
                    i += j-1;
                    break;
                } else if (i+j == length-1) {
                    i += j;
                    arr.add(map.get(tmp));
                    break;
                }
            }
        }
        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.remove();
        }

        return answer;
    }
}
