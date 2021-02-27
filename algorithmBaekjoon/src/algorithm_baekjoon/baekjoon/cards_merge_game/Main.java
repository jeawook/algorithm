package algorithm_baekjoon.baekjoon.cards_merge_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

//15903번 카드 합체 놀이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        Queue<Long> pq = new PriorityQueue<>();
        Long answer = 0L;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }
        for (int i = 0; i < m; i++) {
            long a1 = pq.remove();
            long a2 = pq.remove();
            pq.add(a1 + a2);
            pq.add(a1 + a2);
        }
        for (long i : pq) {
            answer += i;
        }
        System.out.println(answer);
    }
}
