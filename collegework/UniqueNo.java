import java.util.*;
;public class UniqueNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count =0;
        int a=in.nextInt();
        int b=in.nextInt();
        for(int i=a;i<=b;i++)
        {
           int j=i%10;
           int k=i/10;
           if(i!=k) count++;

        }
        System.out.println(count);


    
    }
}
