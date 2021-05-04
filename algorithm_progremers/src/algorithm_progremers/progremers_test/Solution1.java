package algorithm_progremers.progremers_test;

import algorithm_progremers.that_song.Solution;

public class Solution1 {

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        //int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        //int[] win_nums = {38, 19, 20, 40, 15, 25};
        Solution1 solution1 = new Solution1();
        solution1.solution(lottos, win_nums);

    }
    public int[] solution(int[] lottos, int[] win_nums) {

        int size = 6;
        int matchCnt = 0;
        int nCnt = 0;
        int[] rank = {6,6,5,4,3,2,1};
        for (int i=0; i < size; i++) {
            if (lottos[i] == 0) {
                nCnt++;
            } else {
              for (int n : win_nums) {
                  if (n == lottos[i]) {
                      matchCnt++;
                  }
              }
            }
        }
        int[] answer = {rank[matchCnt+nCnt],rank[matchCnt]};
        return answer;
    }
}
