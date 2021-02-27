package algorithm_baekjoon.baekjoon.tow_plus_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//11508번 2+1 세일
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                pq.remove();
            } else {
                count += pq.remove();
            }
        }
        System.out.println(count);
    }
}
