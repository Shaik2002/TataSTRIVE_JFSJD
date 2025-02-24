import java.util.LinkedList;
import java.util.Queue;

public class P18_Collections_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.offer("Apple");
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}