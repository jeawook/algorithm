package algorithm_baekjoon.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// 5430 AC
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] list;
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> que = new PriorityQueue<Integer>();

        for(int i=0;i<num;i++){
            int size = Integer.parseInt(br.readLine());
            String values = br.readLine();
            list = makeList(values);

        }
    }
    static int[] makeList(String values){
        values = values.replaceAll("[^0-9]", "");
        int[] tmp = Arrays.stream(values.split("")).mapToInt(Integer::parseInt).toArray();
        return tmp;
    }
    static void reserve(int[] list){
        for(int i=0;i<list.length/2;i++){
            int tmp = list[i];
            list[i] = list[list.length-i];
            list[list.length-i] = tmp;
        }
    }
}
