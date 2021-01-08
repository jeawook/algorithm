package algorithm_baekjoon.baekjoon.num_card;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//10815번 숫자카드
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] N_cards = new int[N];
        for (int i = 0;i<N;i++) {
            N_cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(N_cards);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] M_cards = new int[M];
        for (int i=0;i<M;i++) {
            M_cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int tmp : M_cards) {
            int left = 0;
            int right = N-1;
            boolean flag = true;
            while (left <= right) {
                int mid = (left+right)/2;
                if (N_cards[mid] == tmp) {
                    flag = false;
                    sb.append(1+" ");
                    break;
                }else if (N_cards[mid] < tmp) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
            if (flag) {
                sb.append(0+" ");
            }
        }
        System.out.println(sb.toString());
    }
}
