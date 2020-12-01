package algorithm_baekjoon.balanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 4949 균형잡힌 세상
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            Stack stack = new Stack();
            boolean flag =true;
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            for (char tmp : str.toCharArray()){

                if (tmp == ')'){
                    if (!stack.isEmpty() && (char)stack.peek() == '('){
                        stack.pop();
                    }else{
                        flag = false;
                        break;
                    }
                }else if(tmp == ']'){
                    if (!stack.isEmpty() && (char)stack.peek() == '['){
                        stack.pop();
                    }else{
                        flag = false;
                        break;
                    }
                }else if (tmp == '(' || tmp == '['){
                    stack.add(tmp);
                }
            }
            if(stack.isEmpty() && flag){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
        }
        System.out.println(sb.toString());

    }
}
