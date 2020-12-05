package algorithm_baekjoon.sortInside;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1427번 소트인사이드
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] list = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        bubbleSort(list);
        for (int tmp : list){
            sb.append(tmp);
        }
        System.out.println(sb.toString());

    }
    static void bubbleSort(int[] list){
        for(int i=0;i<list.length;i++){
            boolean flag = true;
            for (int j =0;j< list.length-1;j++){
                if (list[j] < list[j+1]){
                    flag = false;
                    swap(list,j,j+1);
                }
            }
            if (flag){
                break;
            }
        }
    }
    static void swap(int[] list, int a, int b){
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }
}
