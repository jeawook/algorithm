package algorithm_baekjoon.baekjoon.sort_card;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//1715번 카드 정렬하기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<N;i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int ans = 0;
        while (pq.size()!=1) {
            int sum =pq.poll() + pq.poll();
            pq.add(sum);
            ans += sum;
        }
        System.out.println(ans);
    }
}
