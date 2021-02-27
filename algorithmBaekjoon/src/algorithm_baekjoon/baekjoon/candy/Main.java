package algorithm_baekjoon.baekjoon.candy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//11256번 사탕
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            Integer[] box = new Integer[Integer.parseInt(st.nextToken())];
            for (int j = 0; j < box.length; j++) {
                st = new StringTokenizer(br.readLine());
                box[j] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }
            Arrays.sort(box, Collections.reverseOrder());
            int sum = 0;
            int cnt = 0;
            for (int t : box) {
                sum += t;
                cnt++;
                if (sum >= candy) {
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}
