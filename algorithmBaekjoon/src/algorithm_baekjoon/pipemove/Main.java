package algorithm_baekjoon.pipemove;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//2798번 블랙잭
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = search(num[0], num[1], cards );
        System.out.println(sum);

    }

    static int search(int num,int target, int[] cards) {

        int max = 0;
        for (int i=0;i<num-2;i++) {
            for (int j = i+1;j<num-1;j++) {
                for (int k=j+1;k<num;k++) {
                    int sum = cards[i]+cards[j]+cards[k];
                    if (sum > target)
                        continue;
                    if (sum <= target && sum > max) {
                        max = sum;
                        if(max == target){
                            return max;
                        }
                    }
                }
            }
        }
        return max;
    }
}
