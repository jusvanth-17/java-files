import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Queue<Integer> queue=new PriorityQueue<>();
    
        for (int i = 0; i <n; i++) {
            queue.add(in.nextInt());
        }
        Object[]a =queue.toArray();
        System.out.println(Arrays.toString(a));
    }
}
