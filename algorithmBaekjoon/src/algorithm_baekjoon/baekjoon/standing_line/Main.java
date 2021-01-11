package algorithm_baekjoon.baekjoon.standing_line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1138번 한 줄로 서기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] line = new int[N];
        for (int i=0;i < N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0;i<N;i++) {
            int tmp = arr[i];
            for (int j=0;j<N;j++) {
                if (line[j] == 0 && tmp == 0) {
                    line[j] = i+1;
                    break;
                } else if (line[j] == 0){
                  tmp--;
                }
            }
        }
        for (int i : line) {
            System.out.print(i+" ");
        }
    }
}
