package algorithm_baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 10828번 스택
public class Main {
    static int[] stack;
    static int top = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        String command = null;
        stack = new int[num];
        for(int i=0;i<num;i++){
            command = br.readLine();
            switch (command){
                case "pop" :
                    sb.append(pop()+"\n");
                    break;
                case "size" :
                    sb.append(size()+"\n");
                    break;
                case "empty" :
                    sb.append(empty()+"\n");
                    break;
                case "top" :
                    sb.append(top()+"\n");
                    break;
                default:
                    if(command.startsWith("push")){
                        int value = Integer.parseInt(command.split(" ")[1]);
                        push(value);
                    }
            }
        }
        System.out.println(sb.toString());
    }
    static void push(int x) {
        stack[++top] = x;
    }

    static int pop() {
        if(top <=-1)
            return -1;
        return stack[top--];
    }

    static int size() {
        return top+1;
    }

    static int empty() {
        if(top == -1)
            return 1;
        else
            return 0;

    }
    static int top() {
        if(top == -1)
            return -1;
        else
            return stack[top];
    }
}
