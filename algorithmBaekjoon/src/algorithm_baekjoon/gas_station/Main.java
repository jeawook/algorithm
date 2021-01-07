package algorithm_baekjoon.gas_station;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//13305번 주유소
public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long[] roads = new Long[N-1];
        Long[] price = new Long[N];

        for (int i=0;i<N-1;i++) {
            roads[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<N;i++) {
            price[i] = Long.parseLong(st.nextToken());
        }
        Long sum = price[0] * roads[0];
        Long before = price[0];
        for (int i=1;i<N-1;i++) {
            if (before > price[i]) {
                sum += price[i] * roads[i];
                before = price[i];
            }else {
                sum += before * roads[i];
            }
        }
        System.out.println(sum);
    }

}
