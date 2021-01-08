package algorithm_baekjoon.baekjoon.IntNSum;

// 15596번 정수 N개의 합
public class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int x : a){
            ans += x;
        }
        return ans;
    }
}
