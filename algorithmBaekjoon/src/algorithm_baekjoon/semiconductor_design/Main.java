package algorithm_baekjoon.semiconductor_design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//2352번 반도체 설계
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        list.add(0);
        for (int i=0;i<n;i++) {
            int port = Integer.parseInt(st.nextToken());
            if (port > list.get(list.size()-1)) {
                list.add(port);
            } else {
                int left = 0;
                int right = list.size();
                while (left< right) {
                    int mid = (left+right)/2;
                    if (list.get(mid) >= port) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                list.set(right,port);
            }
        }
        System.out.println(list.size()-1);

    }
}
