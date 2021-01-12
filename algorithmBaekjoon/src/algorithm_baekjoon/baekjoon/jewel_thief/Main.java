package algorithm_baekjoon.baekjoon.jewel_thief;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1202번 보석 도둑
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<int[]> jewels = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int[] bag = new int[K];
        for (int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            int[] jewel  = new int[2];
            jewel[0] = Integer.parseInt(st.nextToken());
            jewel[1] = Integer.parseInt(st.nextToken());
            jewels.add(jewel);
        }
        for (int i=0;i<K;i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }
        Collections.sort(jewels, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        Arrays.sort(bag);
        Long point = 0L;
        int j = 0;
        for (int i=0;i<K;i++) {
            int weight = bag[i];
            while (j < N && weight >= jewels.get(j)[0]) {
                    pq.add(jewels.get(j)[1]);
                    j++;
            }
            if (!pq.isEmpty()){
                point += pq.poll();
            }
        }
        System.out.println(point);
    }
}
