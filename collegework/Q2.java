import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Queue<Integer> queue=new PriorityQueue<>();
    
        for (int i = 0; i <n; i++) {
            queue.add(in.nextInt());
        }
        Queue<Integer> q=new PriorityQueue<>();
    
        for (int i = 0; i <n; i++) {
            q.add(queue.peek());
            q.add(queue.poll());
        }
        System.out.println(q);
        

    }
    
}
