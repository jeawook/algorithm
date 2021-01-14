package algorithm_baekjoon.baekjoon.skip_log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//11497번 통나무 건너뛰기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        for (int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            int[] answer = new int[N];
            for (int j=0;j<N;j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int mid = N/2;
            answer[mid] = arr[N-1];
            int left = mid-1;
            int right = mid+1;
            int j = N-2;

            while(j >=0) {
                answer[left--] = arr[j];
                j--;
                if (j <0) {
                    break;
                }
                answer[right++] = arr[j];
                j--;

            }
            int max = Math.abs(answer[0] - answer[N-1]);
            for (int k=1;k<N;k++) {
                int abs = Math.abs(answer[k - 1] - answer[k]);
                if (max < abs) {
                    max = abs;
                }
            }

            sb.append(max+"\n");
        }
        System.out.println(sb.toString());
    }
}
