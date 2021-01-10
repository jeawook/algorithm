package algorithm_baekjoon.baekjoon.word_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//1339번 단어 수학
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        int sum = 0;
        int[] alpha = new int[26];
        int max = 0;
        for (int i=0;i<N;i++) {
            arr[i] = br.readLine();
            if (arr[i].length() > max) {
                max =arr[i].length();
            }
        }

        for (int i=max;i>0;i--) {

            for (int j=0;j<N;j++) {
                if (arr[j].length() >=i){
                    int tmp = arr[j].charAt(arr[j].length() -i) - 'A';

                    alpha[tmp]  += (int)Math.pow(10,i-1);
                }
            }
        }
        Arrays.sort(alpha);
        int cnt = 9;
        for (int i= alpha.length - 1;i>0;i--) {
            if (alpha[i] == 0) {
                break;
            }
            sum += alpha[i] * cnt;
            cnt--;
        }
        System.out.println(sum);
    }
}
