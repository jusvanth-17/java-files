import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        queue.offer(5);
        queue.offer(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        System.out.println(queue);
        System.out.println("The head is "+queue.peek());
    }
    
}
