package algorithm_progremers.kakao_2022_test.programming_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        new Solution().solution(fees, records);
    }
    public int[] solution(int[] fees, String[] records) {

        HashMap<String, Integer> list = new HashMap<>();
        HashMap<String, String> inTime = new HashMap<>();
        for (String record : records) {
            String[] info = record.split(" ");
            if (info[2].equals("IN")) {
                inTime.put(info[1], info[0]);
            } else if (info[2].equals("OUT")) {

                int time = getTime(inTime.get(info[1]), info[0]);
                list.put(info[1], list.getOrDefault(info[1], time));
                inTime.remove(info[1]);
            }

        }
        for (String str : inTime.keySet()) {
            String s = inTime.get(str);
            int time = getTime(s, "23:59");
            list.put(str, list.getOrDefault(str, 0)+time);
        }
        int[] answer = new int[list.size()];
        int i = 0;
        String[] arr = list.keySet().toArray(new String[0]);
        Arrays.sort(arr);
        for (String key : arr ) {
            int time = list.get(key);
            if (time < fees[0]) {
                answer[i] = fees[1];
            } else {
                time -= fees[0];
                answer[i] = fees[1] + (time/fees[2]) * fees[3];
                if (time % fees[2] >0) {
                    answer[i] += fees[3];
                }
            }
            i++;
        }
        return answer;
    }

    static int getTime(String inTime, String outTime) {
        int[] in = Arrays.stream(inTime.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] out = Arrays.stream(outTime.split(":")).mapToInt(Integer::parseInt).toArray();
        if (in[1] > out[1]) {
            out[0]--;
            out[0] -= in[0];
            out[1]+=60;
            out[1] -= in[1];
        } else {
            out[1] -= in[1];
            out[0] -= in[0];
        }

        return out[0] * 60 + out[1];
    }


}
