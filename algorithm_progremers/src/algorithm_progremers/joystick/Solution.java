package algorithm_progremers.joystick;

public class Solution {
    public static void main(String[] args) {
        String name = "AZAAAZ";
        //String name = "ZZZ";
        Solution solution = new Solution();
        System.out.println(solution.solution(name));
    }
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        for(int i=0;i<len;i++) {
            char ch = name.charAt(i);
            answer += Math.min(ch - 'A',Math.abs( 'Z' - ch)+1);
        }
        System.out.println(answer);
        for(int i=1;i<len;i++) {
            char ch = name.charAt(i);
            System.out.println("ch = " + ch);
            if( ch == 'A') {
                int cnt = 1;
                i++;
                while(i < len) {
                    cnt++;
                    if(name.charAt(i) != 'A') {
                        break;
                    }
                    i++;
                }
                if(cnt > len - cnt) {
                    answer += len-cnt;
                } else {
                    answer += cnt;
                }
            } else {
                answer++;
            }
            System.out.println(answer);
        }
        return answer;
    }
}
