import java.util.Queue;
import java.util.LinkedList;


public class Queuepoll {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
         queue.offer("one");
        queue.add("two");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
