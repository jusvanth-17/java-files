import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        for (int i = 1; i <=10; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            
         
            if(queue.peek()%2==0)
            {
                System.out.println(queue.poll());
                continue;
            }
            queue.poll();
        
    }
    }
}
