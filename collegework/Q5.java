import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Queue<Character> queue=new PriorityQueue<>();
    
        for (int i = 0; i <n; i++) {
            queue.add(in.next().charAt(0));
        }

       while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
