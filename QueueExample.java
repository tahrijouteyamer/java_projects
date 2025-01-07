import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        
        System.out.println(queue.poll()); // Removes "Task 1"
        System.out.println(queue.peek()); // Shows "Task 2" without removing it
    }
}
