package algorithm_baekjoon.baekjoon.dequeue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

// 10866 덱
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<Integer>();

        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            String command = br.readLine();
            switch (command){
                case "pop_front" :
                    try {
                        sb.append(deque.removeFirst()+"\n");
                    } catch (NoSuchElementException e){
                        sb.append("-1\n");
                    }
                    break;
                case "pop_back" :
                      try {
                          sb.append(deque.removeLast()+"\n");
                      } catch (NoSuchElementException e){
                          sb.append("-1\n");
                      }
                    break;
                case "size" :
                    sb.append(deque.size()+"\n");
                    break;
                case "empty" :
                    sb.append(deque.isEmpty() ? 1 : 0);
                    sb.append("\n");
                    break;
                case "front" :
                    sb.append(deque.peekFirst() == null ? -1 : deque.peekFirst());
                    sb.append("\n");
                    break;
                case "back" :
                    sb.append(deque.peekLast() == null ? -1 :deque.peekLast());
                    sb.append("\n");
                    break;
                default:
                    if(command.startsWith("push_front")){
                        deque.addFirst(Integer.parseInt(command.split(" ")[1]));
                    }else if(command.startsWith("push_back")){
                        deque.addLast(Integer.parseInt(command.split(" ")[1]));
                    }
            }

        }
        System.out.println(sb.toString());

    }
}
