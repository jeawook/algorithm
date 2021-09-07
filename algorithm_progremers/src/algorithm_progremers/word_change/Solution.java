package algorithm_progremers.word_change;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        bfs(begin, target, words, visited, 0);
        return answer;
    }
    public int bfs(String begin, String target, String[] words, boolean[] visited, int cnt ) {

        for (int i=0; i < words.length; i++) {
            if (solve(begin, words[i]) && !visited[i]) {
                visited[i] = true;
                bfs(words[i],target, words, visited, cnt+1);
                visited[i] = false;
            }
        }
        return cnt;
    }
    public boolean solve(String tmp1, String tmp2) {
        int n = 0;
        for (int i=0; i< tmp1.length(); i++) {
            if (tmp1.charAt(i) != tmp2.charAt(i)) {
                n++;
            }
            if (n > 2) {
                return false;
            }
        }
        return true;
    }


}
