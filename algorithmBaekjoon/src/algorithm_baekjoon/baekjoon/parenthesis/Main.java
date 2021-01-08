package algorithm_baekjoon.baekjoon.parenthesis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 백준 9012번 괄호
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            int left = 0;
            int right = 0;
            String vps = br.readLine();
            for(char tmp :vps.toCharArray()){
                if(tmp == '('){
                    left++;
                }else if(tmp == ')'){
                    right++;
                    if(right>left){
                        break;
                    }
                }
            }
            if(left == right){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb.toString());
    }
}
