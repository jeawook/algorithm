package algorithm_progremers.naver_test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_3 {
    public static void main(String[] args) {
        String s = "abcxyasdfasdfxyabc";
        s= "abcxyqwertyxyabc";
        String[] solution = solution(s);
    }

    public static String[] solution(String s) {
        String[] answer = {};
        int len = s.length();
        int start = 0;
        int mid = len/2;
        int end = len;
        int t = 1;
        boolean flag = false;
        Queue<String> q = new LinkedList<>();
        while(start <mid) {
            String s1 = s.substring(start, start + t);
            String s2 = s.substring(end-t,end);
            if (start+t >mid) {
                q.add(s.substring(start,end));
                flag = true;
                break;
            }

            if (s1.equals(s2)) {
                q.add(s1);
                start +=t;
                end -=t;
                t =1;
            }else {
                t++;
            }
        }
        int n;
        if (!flag) {
            n = q.size() *2;
        }else {
            n = q.size() *2 -1;
        }
        answer = new String[n];

        System.out.println(n);
        for (int i=0; i <n/2; i++ ) {
            String tmp = q.remove();
            System.out.println(tmp);
            answer[i] = tmp;
            answer[n-i-1] = tmp;
        }
        if (flag) {
            answer[n/2] = q.remove();
            System.out.println(answer[n/2]);
        }



        return answer;
    }
}
