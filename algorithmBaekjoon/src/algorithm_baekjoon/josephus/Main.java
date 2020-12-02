package algorithm_baekjoon.josephus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//11866 요세푸스 문제0
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] value = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> que = new LinkedList<Integer>();
        sb.append("<");
        for(int i=1;i<=value[0];i++){
            que.add(i);
        }
        int i =0;
        while(!que.isEmpty()){
            i++;
            if (i == value[1]) {
                sb.append(que.remove());
                if (que.isEmpty()) {
                    sb.append(">");
                    break;
                }
                sb.append(", ");
                i = 0;
                continue;
            }
            que.add(que.remove());
        }
        System.out.println(sb.toString());
    }
}
