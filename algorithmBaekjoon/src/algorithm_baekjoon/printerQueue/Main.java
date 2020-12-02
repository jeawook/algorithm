package algorithm_baekjoon.printerQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//1966 프린터 큐
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que ;

        HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            int popCnt = 0;
            int[] ptr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] printList = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            que = new LinkedList<Integer>();
            for (int j=0;j<printList.length;j++){
                que.add(printList[j]);
            }
            while(!que.isEmpty()){
                boolean flag =false;
                int tmp1 = que.remove();

                for (int tmp2 : que){
                    if(tmp1 < tmp2){
                        flag = true;
                        break;
                    }
                }

                if (flag){
                   que.add(tmp1);
                }else{
                    popCnt++;
                    if (ptr[1] == 0)
                       break;
                }
                ptr[1]--;
                if(ptr[1] < 0){
                    ptr[1] = que.size()-1;
                }

            }
            sb.append(popCnt+"\n");
        }
        System.out.println(sb.toString());

    }
}
