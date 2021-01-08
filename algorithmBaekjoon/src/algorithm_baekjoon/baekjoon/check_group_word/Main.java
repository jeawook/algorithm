package algorithm_baekjoon.baekjoon.check_group_word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1316번 그룹 단어 체커
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i=0;i<N;i++) {
            boolean flag = true;
            String str  = br.readLine();
            int[] list = new int[32];
            int index = 0;
            while (index < str.length()) {
                int value = str.charAt(index) -'a';
                if (list[value] == 0) {
                    list[value] = 1;
                    for (int j=index;j<str.length();j++) {
                        if (value == str.charAt(index) - 'a') {
                            index++;
                        }
                    }
                } else {
                    flag = false;
                  break;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
