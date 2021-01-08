package algorithm_baekjoon.baekjoon.ACM;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10250번 ACM 호텔
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T =  Integer.parseInt(br.readLine());

        for (int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int room = N % H == 0 ? N/H  : N/H+1;
            int floor = N%H == 0 ? H : N%H;
            floor *= 100;
            System.out.println(room+floor);
        }
    }

}
