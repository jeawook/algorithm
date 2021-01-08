package algorithm_baekjoon.baekjoon.IntSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 2750 수 정렬하기
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];
        for (int i=0;i<num;i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        bubbleSort(list, num);
        for (int tmp : list){
            sb.append(tmp+"\n");
        }
        System.out.println(sb.toString());
    }
    static void bubbleSort(int[] list, int n){

        for (int i=0;i<n-1;i++){
            boolean flag = true;
            for (int j=0;j<n-1;j++){
                if (list[j] > list[j+1]){
                    flag =false;
                    swap(list, j, j+1);
                }
            }
            if (flag){
                break;
            }
        }
    }
    static void swap(int[] list ,int a, int b){
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }
}
