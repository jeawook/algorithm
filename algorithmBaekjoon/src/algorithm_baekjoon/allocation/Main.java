package algorithm_baekjoon.allocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 1931번 회의실 배정
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] meeting = new int[num][2];
        for (int i =0; i<num;i++){
            int[] time = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            meeting[i][0] = time[0];
            meeting[i][1] = time[1];
        }
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        };
        int cnt = 0;
        int pre_end_time = 0;
        Arrays.sort(meeting,comparator);

        for (int i=0;i<num;i++){
            if (pre_end_time <= meeting[i][0]){
                cnt++;
                pre_end_time = meeting[i][1];
            }
        }
        System.out.println(cnt);
    }
}
