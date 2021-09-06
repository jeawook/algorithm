package algorithm_progremers.kakao_test2;

public class Solution_2 {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i=0; i < places.length; i++) {
            String[] tmp = places[i];
            int flag = 1;
            char[][] arr = new char[5][5];
            for (int j=0; j <tmp.length; j++) {
                arr[j] = tmp[j].toCharArray();
            }
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (arr[j][k] == 'P') {
                        if (j+1 < arr.length) {
                            if (arr[j+1][k] == 'P') {
                                flag = 0;
                                break;
                            }
                        }
                        if (k+1 < arr.length) {
                            if (arr[j][k+1] == 'P') {
                                flag = 0;
                                break;
                            }
                        }
                    }
                }
                if (flag == 0) {
                    break;
                }
            }
            answer[i] = flag;
        }
        return answer;
    }
}
