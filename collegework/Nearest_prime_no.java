import java.util.*;
class Nearest_prime_no{
    public static boolean isPrime(long num) {
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
        Scanner in =new Scanner(System.in);
        long t,n=0;
        t=in.nextLong();
        while(t-- >0)
        {
            n=in.nextLong();
        }
     long  i=n,j=n;
     while(true)
     {
        i--;
        j++;
        if(i>=0 && isPrime(i))
        {
            System.out.println(i);
            break;
        }
       else if( isPrime(j))
        {
            System.out.println(j);
            break;
        }
     }
 }
}