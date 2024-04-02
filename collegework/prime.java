import java.util.*;
class prime {
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
    System.out.println(isPrime(n));
    }
}

