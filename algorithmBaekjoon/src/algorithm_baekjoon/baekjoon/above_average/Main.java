package algorithm_baekjoon.baekjoon.above_average;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//4344번 평균은 넘겠지
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] students = new int[N]; 
            int sum = 0;
            double average;
            for (int j = 0; j < N; j++) {
                students[j] = Integer.parseInt(st.nextToken());
                sum += students[j];
            }
            average = (double)sum / N;
            int cnt = 0;
            for (int student : students) {
                if (average < student) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(double)cnt / N * 100);

        }

    }
}
