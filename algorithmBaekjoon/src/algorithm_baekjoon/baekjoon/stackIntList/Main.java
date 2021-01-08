package algorithm_baekjoon.baekjoon.stackIntList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 백준 1874번 스택 수열
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        int ptr = 0;
        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];

        for(int i=0;i<num;i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        for (int i=1;i<=num;i++){
            stack.add(i);
            sb.append("+\n");
            while(stack.peek() == list[ptr]){
                stack.pop();
                sb.append("-\n");
                ptr++;
                if (stack.isEmpty())
                    break;
            }
        }
        if(stack.isEmpty())
            System.out.println(sb);
        else
            System.out.println("NO");
    }


}
