package algorithm_baekjoon.baekjoon.queue;

import java.io.*;

// 백준 18258번
// 큐
public class Main {
	static int[] queue;
	static int rear = -1;
	static int front = -1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int max;
		String str = null;
		String command = null;
		int num  = Integer.parseInt(br.readLine());
		queue = new int[num];
		for(int i=0;i<num;i++){
			str = br.readLine();
			switch (str){
				case "pop" :
					sb.append(pop()+"\n");
					break;
				case "size" :
					sb.append(size()+"\n");
					break;
				case "empty" :
					sb.append(empty()+"\n");
					break;
				case "front" :
					sb.append(front()+"\n");
					break;
				case "back" :
					sb.append(back()+"\n");
					break;
				default:
					if(str.startsWith("push")){
						int value =Integer.parseInt(str.split(" ")[1]);
						push(value);
					}

			}
		}
		System.out.println(sb.toString());
	}
	public static int pop() {
		if (rear>front) return queue[++front];
		else return -1;
	}
	public static int size() {
		return rear - front;
	}
	public static int empty() {
		if(rear == front)
			return 1;
		else
			return 0;
	}
	public static int front() {
		if(rear == front)
			return -1;
		else
			return queue[front+1];
	}
	public static int back() {
		if(rear == front)
			return -1;
		else
			return queue[rear];
	}
	public static void push(int num){
		queue[++rear] = num;
	}

}
