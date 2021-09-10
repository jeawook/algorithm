package algorithm_progremers.kakao_2021.failureate;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        //int N = 5; // 스테이지 개수
        int N = 4; // 스테이지 개수
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 인원별 클리어 단계
        int[] stages = {4, 4, 4, 4, 4}; // 인원별 클리어 단계
        new Solution().solution(N, stages);
    }

    private static class Stage {
        int idx;
        double percent;

        public Stage(int idx, double percent) {
            this.idx		= idx;
            this.percent	= percent;
        }
    }
    // 클리어 실패 인원 / 클리어 완료 인원
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        PriorityQueue<Stage> pq = new PriorityQueue<>(new Comparator<Stage>() {
            @Override
            public int compare(Stage o1, Stage o2) {
                if (o1.percent - o2.percent < 0) return 1;
                else if (o1.percent - o2.percent == 0) {

                    if (o1.idx < o2.idx) return -1;
                    else return 1;
                }
                else return -1;
            }
        });

        for (int i= 1; i <= N; i++) {
            int pass = 0;
            int fail = 0;
            for (int j=0; j < stages.length; j++) {
                if (i == stages[j]) {
                    fail++;
                    pass++;
                } else if(i < stages[j]) {
                    pass++;
                }
            }
            System.out.println(fail);
            pq.add(new Stage(i, fail / (double)pass)) ;

        }
        for (int i=0 ; i < N; i++) {
            answer[i] = pq.poll().idx;
        }

        return answer;
    }
}
