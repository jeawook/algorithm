package algorithm_baekjoon.baekjoon.AtoB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//13019번 A를 B로
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toCharArray();
        String str2 = br.readLine();
        ArrayList<Character> list1 = new ArrayList<>();
        for (char ch : str1) {
            list1.add(ch);
        }
        int cnt = 0;
        boolean flag = true;
        for (int i = str2.length() - 1; i >= 0;i--) {
            char ch = str2.charAt(i);
            for (int j = i; j  >= 0;j--) {
                char t = list1.remove(list1.size()-1);
                System.out.println(ch+", "+t);
                if (ch == t) {
                    flag = false;
                    break;
                } else {
                    cnt++;
                    list1.add(0,t);
                }
            }
            if (flag) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(cnt);

    }
}
