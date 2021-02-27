package algorithm_baekjoon.baekjoon.change;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//16916번 거스름돈
public class Main2 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int[] change = {5,2};
        int money = Integer.parseInt(br.readLine());
        int mok = money / change[0];
        int na = money % change[0];
        if (na % change[1] != 0) {
            while (mok > 0) {
                mok--;
                na += 5;
                if (na % change[1] == 0) {
                    System.out.println(mok + na/change[1]);
                    return;
                }
            }
            System.out.println(-1);
        } else {
            System.out.println(mok + na/change[1]);
        }
    }

}
