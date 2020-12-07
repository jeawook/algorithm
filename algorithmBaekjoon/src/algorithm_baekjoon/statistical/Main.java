package algorithm_baekjoon.statistical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2018번 통계학
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[] list = new int[num];
        int[] counting = new int[8001];
        int total = 0;
        int mid =0;
        int range = 0;
        int average = 0;
        for (int i=0;i<num;i++){
            list[i] = Integer.parseInt(br.readLine())+4000;
            total += list[i]-4000;
            counting[list[i]]++;
        }
        int cnt=0;
        int max = 0;
        int maxCnt = 0;
        int flag = 0;
        for (int i=0;i< counting.length;i++){
            int value = i -4000;

            if (flag == 0 && maxCnt == counting[i]){
                max = value;
                flag ++;
            }
            if (maxCnt < counting[i]){
                maxCnt = counting[i];
                flag = 0;
                max = value;
            }
            for (int j=0;j<counting[i];j++){
                list[cnt++] = value;
            }
        }
        average = (int)Math.round((double) total/num);
        mid = list[list.length/2];
        range = list[list.length-1] - list[0];
        System.out.println(average);
        System.out.println(mid);
        System.out.println(max);
        System.out.println(range);

    }
}
