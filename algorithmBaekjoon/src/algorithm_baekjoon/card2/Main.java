package algorithm_baekjoon.card2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<Integer>();
        Scanner stdIn = new Scanner(System.in);
        int size = stdIn.nextInt();

        for(int i=1;i<=size;i++){
            que.add(i);
        }
        int val = 0;
        while(!que.isEmpty()){
            val = que.remove();
            if(!que.isEmpty()){
                que.add(que.remove());
            }
        }
        System.out.println(val);
    }
}
