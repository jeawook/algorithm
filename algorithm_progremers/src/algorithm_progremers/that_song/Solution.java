package algorithm_progremers.that_song;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        //String m = "ABCDEFG";
        //String m = "CC#BCC#BCC#BCC#B";
        String m = "ABC";
        //String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        //String[] musicinfos = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
        String[] musicinfos = {"11:59,12:21,HELLO,C#DEFGAB", "13:01,13:05,WORLD,ABCDEF"};

        Solution solution = new Solution();
        solution.solution(m, musicinfos);
    }
    class Music implements Comparable<Music>{
        int time;
        String name;

        public Music(int time, String name) {
            this.time = time;
            this.name = name;
        }

        @Override
        public int compareTo(Music m) {
            return this.time > m.time ? -1 : 1;
        }
    }
    static int convertTime(String time) {
        String hour = time.split(":")[0];
        String minute =  time.split(":")[1];
        return Integer.parseInt(hour) * 60 + Integer.parseInt(minute);
    }
    static String convertMusic(String music, int time) {
        ArrayList<String> clef = new ArrayList<>();

        for (int i = 0; i < music.length(); i++) {
            if (i+1 < music.length()) {
                if (music.charAt(i+1) == '#') {
                    clef.add(music.substring(i, i+2));
                    i++;
                } else {
                    clef.add(music.substring(i,i+1));
                }
            } else {
                if (music.charAt(i) != '#') {
                    clef.add(music.substring(i, i+1));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int musicLength = clef.size();
        if (musicLength > time) {
            for (int i = 0; i < time; i++) {
                sb.append(clef.get(i));
            }
        } else {
            int flag = 0;
            for (int i = 0; i < time; i++) {
                if (i % musicLength ==0) {
                    flag = 0;
                }
                sb.append(clef.get(flag));
                flag++;
            }

        }
        return sb.toString();
    }

    public String solution(String m, String[] musicinfos) {
        String answer = "";

        PriorityQueue<Music> queue = new PriorityQueue<>();

        for (int i=0; i < musicinfos.length; i++) {
            String startTime = musicinfos[i].split(",")[0];
            String endTime = musicinfos[i].split(",")[1];
            String name = musicinfos[i].split(",")[2];
            String music = musicinfos[i].split(",")[3];
            int time = convertTime(endTime) - convertTime(startTime);
            String buildMusic = convertMusic(music, time);

            if (buildMusic.contains(m)) {
                queue.add(new Music(time, name));
            }
        }
        if (queue.isEmpty()) {
            answer = "(None)";
        }else {
            answer = queue.remove().name;
        }

        System.out.println(answer);
        return answer;
    }
}
