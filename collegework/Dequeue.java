import java.util.ArrayDeque;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dequeu=new ArrayDeque<Integer>();
        dequeu.add(20);
        dequeu.addFirst(40);
        dequeu.addLast(60);
        dequeu.add(100);
        dequeu.addFirst(20);
        System.out.println(dequeu);
    }
    
}
