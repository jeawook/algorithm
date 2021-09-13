package algorithm_progremers.kakao_2022_test.programming_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        new Solution().solution(id_list, report, k);
    }



    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> reportCount = new HashMap<>();
        HashMap<String, ArrayList<String>> reportData = new HashMap<>();
        for (String tmp : report) {
            String[] data = tmp.split(" ");

            reportData.put(data[0], reportData.getOrDefault(data[0], new ArrayList<>()));

            if (!reportData.get(data[0]).contains(data[1])) {
                reportData.get(data[0]).add(data[1]);
                reportCount.put(data[1], reportCount.getOrDefault(data[1], 0)+1);
            }
        }
        for (int i=0; i < id_list.length; i++) {
            ArrayList<String> list = reportData.getOrDefault(id_list[i], new ArrayList<>());
            if (list.size() > 0) {
                for (String user : list) {
                    if (k <= reportCount.get(user)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
}
