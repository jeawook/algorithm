package algorithm_baekjoon.num_card2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10816번 숫자 카드 2
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N =  Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cards = new int[20000001];
        for (int i=0;i<N;i++){
            cards[Integer.parseInt(st.nextToken())+10000000]++;
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i=0;i<M;i++) {
            sb.append((cards[Integer.parseInt(st.nextToken())+10000000])+" ");
        }
        System.out.println(sb.toString());
    }
}
