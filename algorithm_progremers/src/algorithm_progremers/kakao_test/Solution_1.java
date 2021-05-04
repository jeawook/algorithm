package algorithm_progremers.kakao_test;

public class Solution_1 {

    public static void main(String[] args) {
        int[] gift_cards = {4, 5, 3, 2, 1};
        //int[] gift_cards = {5, 4, 5, 4, 5};
        int[] wants = {2, 4, 4, 5, 1};
        //int[] wants = {1, 2, 3, 5, 4};
        Solution_1 solution_1 = new Solution_1();
        solution_1.solution(gift_cards,wants);
    }

    public int solution(int[] gift_cards, int[] wants) {
        int answer = 0;

        for (int i =0; i < wants.length; i++) {
            if (wants[i] == gift_cards[i]) {
                continue;
            }
            for (int j = 0; j < gift_cards.length; j++) {
                if (wants[j] == gift_cards[j]) {
                    continue;
                } else if (wants[i] == gift_cards[j]) {
                    swap(gift_cards,i,j);
                }

            }
        }
        for (int i = 0; i < gift_cards.length; i++) {
            if (gift_cards[i] != wants[i]) {
                answer++;
            }
        }
        return answer;
    }

    static void swap(int[] gift_cards, int i, int j) {
        int tmp = gift_cards[i];
        gift_cards[i] = gift_cards[j];
        gift_cards[j] = tmp;
    }
}
