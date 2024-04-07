import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Queue<Integer> queue=new PriorityQueue<>();
    
        for (int i = 0; i <n; i++) {
            queue.add(in.nextInt());
        }

        for (int i = 0; i < n; i++) {
             queue.remove(i);
            
        }
    }
    
}
