package algorithm_baekjoon.sugar_delivery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2839번 설탕 배달
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int mok = N/5;
        int na = N%5;
        int pack = 0;

        if (na ==0) {
            System.out.println(mok);
        } else {
          for (int i=mok;i >=0 ;i--) {
              if (na % 3 == 0) {
                  pack =mok+na/3;
                  break;
              } else {
                na += 5;
                mok--;
              }
          }
          if (pack == 0) {
              System.out.println(-1);
          } else {
              System.out.println(pack);
          }
        }
    }
}
