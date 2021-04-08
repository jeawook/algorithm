package algorithm_progremers.sort_filename;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        String[] files = {"img12-0101.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        //String[] files = {"F-5 Freedom2 Fighter", "B-500000 Superfortress1111", "A-10 Thunderbolt II", "F-14 Tomcat", "foo010bar002.zip"};
        Solution solution = new Solution();
        solution.solution(files);


    }
    class File implements Comparable<File> {
        String filename;
        String head;
        int number;

        public File(String filename, String head, int number) {
            this.filename = filename;
            this.head = head;
            this.number = number;
        }

        @Override
        public String toString() {
            return filename;
        }

        @Override
        public int compareTo(File o) {
            int result = this.head.compareTo(o.head);
            if (result == 0) {
                return this.number - o.number;
            } else {
                return result;
            }
        }

    }
    public String[] solution(String[] files) {
        String[] answer = {};
        ArrayList<File> arr = new ArrayList<>();
        for (String tmp : files) {
            StringBuilder number = new StringBuilder();
            int numCnt = 0;
            for (int i=0; i < tmp.length(); i++) {
                char ch = tmp.charAt(i);
                if (ch >= '0' && ch <= '9' && numCnt < 5) {
                    numCnt++;
                    number.append(ch);
                } else if (numCnt > 0) {
                    break;
                }
            }
            int location = tmp.indexOf(number.toString());
            String head = tmp.substring(0, location);
            head = head.toUpperCase();
            arr.add(new File(tmp,head,Integer.parseInt(number.toString())));
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i=0; i < answer.length; i++) {
            answer[i] = arr.get(i).toString();
        }

        return answer;
    }
}
