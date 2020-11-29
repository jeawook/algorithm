package algorithmBook.basic;

public class Queue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public Queue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        }catch (OutOfMemoryError e) {
            max = 0;
        }
    }
    public static void main(String[] args) {

    }
}
