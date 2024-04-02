import java.util.*;
public class Prime_pairs {
    public static boolean isPrime(int num) {
        if(num<=1)
        {
           return false;

        }
        for(int i=2;i*i<=num;i++)
        {
           if(num%i==0)
           {
               return false;
           }
        }
        return true;

   }
   public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int m=s.nextInt();
   int count=0;
   for (int i = n; i <=m; i++) {
     if(isPrime(i))
     {
        if(isPrime(i+6))
        {
            System.out.print("("+i+","+(i+6)+")");
            count++;
        }
     }
   }
   System.out.println(count);
   }
}
