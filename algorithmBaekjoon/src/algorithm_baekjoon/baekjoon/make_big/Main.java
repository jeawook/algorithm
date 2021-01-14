package algorithm_baekjoon.baekjoon.make_big;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

//2812번 크게 만들기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[] answer = new int[N-K];
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i=0;i<N;i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && cnt < K) {
                    int tmp = stack.peek();
                    if (tmp < arr[i]) {
                        stack.pop();
                        cnt++;
                    } else {
                      break;
                    }
                }
            }
            stack.add(arr[i]);
        }
        
        if (cnt < K) {
            for (int i=0;i<K-cnt;i++) {
                stack.pop();
            }
        }
        for (int i=N-K-1;i>=0;i--) {
            answer[i] = stack.pop();
        }
        for (int t : answer) {
            System.out.print(t);
        }
    }
}
