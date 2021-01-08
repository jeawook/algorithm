package algorithm_baekjoon.baekjoon.int_num;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2908번 상수
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] arr =  br.readLine().split(" ");
        String max ="";
        for (int i=2;i>=0;i--) {
            if (arr[0].charAt(i) > arr[1].charAt(i)) {
                max = arr[0];
                break;
            } else if (arr[0].charAt(i) < arr[1].charAt(i)){
                max = arr[1];
                break;
            }
        }
        for (int i=2;i>=0;i--) {
            sb.append(max.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
