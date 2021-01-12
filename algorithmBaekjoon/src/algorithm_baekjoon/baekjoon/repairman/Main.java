package algorithm_baekjoon.baekjoon.repairman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//1449번 수리공 항승
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt = 1;
        int pre = arr[0];
        for (int i = 1;i<N;i++) {
            if (arr[i] - pre +1 > L) {
                pre = arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
