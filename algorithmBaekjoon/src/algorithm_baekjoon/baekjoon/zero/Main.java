package algorithm_baekjoon.baekjoon.zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
// 백준 10773 제로
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack<Integer>();
        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i=0;i<num;i++){
            int value = Integer.parseInt(br.readLine());
            if(value ==0){
                stack.pop();
            }else{
                stack.add(value);
            }
        }
        while(!stack.isEmpty()){
            answer += (int)stack.pop();
        }
        System.out.println(answer);

    }
}
