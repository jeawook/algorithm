package algorithm_baekjoon.insert_operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//14888번 연산자 끼워넣기
public class Main {
    static int[] operator = new int[4];
    static int[] arr;
    static int N;
    static Integer max;
    static Integer min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<4;i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,arr[0]);
        System.out.println(max);
        System.out.println(min);


    }
    static void dfs(int depth,  int sum) {
        if (depth==N-1) {
            if (min == null || min > sum) {
                min = sum;
            }
            if (max == null || max < sum) {
                max = sum;
            }
            return;
        }
        for (int j=0;j<4;j++) {
            if (operator[j] !=0){
                operator[j]--;
                dfs(depth + 1, operation(sum, arr[depth+1], j));
                operator[j]++;
            }
        }
    }
    static int operation(int sum, int n, int operator) {
        if (operator == 0) {
            sum = sum + n;
        } else if (operator == 1) {
            sum = sum - n;
        } else if (operator == 2) {
            sum = sum * n;
        } else if(operator == 3) {
            sum = sum / n;
        }
        return sum;
     }
}
