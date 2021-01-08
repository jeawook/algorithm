package algorithm_baekjoon.baekjoon.lostParenthesis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1541번 잃어버린 괄호
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String formula = br.readLine();
        int[] numList = Arrays.stream(formula.split("[^0-9]")).mapToInt(Integer::parseInt).toArray();
        String[] operators = formula.replaceAll("[0-9]","").split("");
        int total = numList[0];
        String tmp = "+";
        int sum = 0;
        for (int i=0;i<operators.length;i++){
            if (operators[i].equals("-")){
                tmp = "-";
                sum +=numList[i+1];
            }else if (operators[i].equals("+")){
                if (tmp.equals("+")){
                    total += numList[i+1];
                }else if(tmp.equals("-")){
                    sum+= numList[i+1];
                }
            }
        }
        total -=sum;
        System.out.println(total);

    }
}
