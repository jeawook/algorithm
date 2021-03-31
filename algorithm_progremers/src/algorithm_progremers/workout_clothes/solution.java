package algorithm_progremers.workout_clothes;

//greedy 체육복
class Solution {
    /**
     *
     * @param n = 5
     * @param lost {2,4}
     * @param reserve {1, 3, 5}
     * @return 5
     */

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int cnt = lost.length;
        int[] check = new int[n+2];
        for(int i : reserve) {
            check[i] = 2;
        }
        for(int i : lost) {
            if(check[i] == 2){
                cnt--;
            }
            check[i]--;
        }

        for(int i : lost) {
            if(check[i] == -1){
                if(check[i-1] == 2) {
                    check[i-1]--;
                    cnt--;
                }else if(check[i+1] == 2) {
                    check[i+1]--;
                    cnt--;
                }
            }

        }

        return answer-cnt;
    }
}
