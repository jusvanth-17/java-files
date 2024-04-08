import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<Integer>();
        for(int i=5;i>0;i--)
        {
            queue.add(i);
        }
        System.out.println(queue);
    }
}
