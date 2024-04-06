import java.util.PriorityQueue;

public class Queueelement {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println(queue);
        System.out.println(queue.element());
    }
}
