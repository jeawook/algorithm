package algorithm_baekjoon.ac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 5430 AC
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());


        for(int i=0;i<num;i++){
            String order = "left";
            String command = br.readLine();
            int listSize = Integer.parseInt(br.readLine());
            String value = br.readLine();
            if (listSize != 0) {
                makeList(value, deque);
            }
            try {
                for (String tmp : command.split("")){
                    if (tmp.equals("R")){
                        if (order.equals("left"))
                            order = "right";
                        else{
                            order = "left";
                        }
                    }else if(tmp.equals("D")){
                            if (order.equals("left")){
                                deque.removeFirst();
                            }else{
                                deque.removeLast();
                            }
                    }
                }
                sb.append("[");
                while (!deque.isEmpty()){
                    if (order.equals("left")){
                        sb.append(deque.removeFirst());
                    }else{
                        sb.append(deque.removeLast());
                    }
                    if (!deque.isEmpty()){
                        sb.append(",");
                    }
                }
                sb.append("]\n");
            } catch (NoSuchElementException e){
                sb.append("error\n");
            }
        }
        System.out.println(sb.toString());
    }
    static void makeList(String values,Deque<Integer> deque){
        values = values.replaceAll("[\\[\\]]", "");

        int[] tmp = Arrays.stream(values.split(",")).mapToInt(Integer::parseInt).toArray();

        for (int x : tmp){
            deque.add(x);
        }
    }
}
