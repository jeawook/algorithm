package algorithm_baekjoon.create_paper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//2630번 색종이 만들기
public class Main {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for (int i=0;i<N;i++){
            paper[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        makePaper(N,0,0);
        System.out.println(white);
        System.out.println(blue);

    }
    static void makePaper(int n, int x, int y) {

        boolean flag = false;
        int tmp = paper[x][y];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (tmp != paper[x+i][y+j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (flag) {
            makePaper(n/2,x,y);
            makePaper(n/2,x+n/2,y);
            makePaper(n/2,x,y+n/2);
            makePaper(n/2,x+n/2,y+n/2);
        } else {
            if (tmp == 0) {
                white ++;
            }else{
                blue ++;
            }
        }
    }
}
