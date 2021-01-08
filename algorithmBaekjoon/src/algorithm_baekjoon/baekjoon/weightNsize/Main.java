package algorithm_baekjoon.baekjoon.weightNsize;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//7568번 덩치
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[][] list = new int[num][2];
        int[] rank = new int[num];
        for (int i=0;i<num;i++) {
            int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list[i][0] = tmp[0];
            list[i][1] = tmp[1];
        }
        for (int i=0;i<num;i++) {
            rank[i] = 1;
            for (int j=0;j<num;j++) {
                if (list[i][0] < list[j][0] && list[i][1] < list[j][1]){
                    rank[i]++;
                }
            }
            sb.append(rank[i]+" ");
        }
        System.out.println(sb.toString());
    }
}
