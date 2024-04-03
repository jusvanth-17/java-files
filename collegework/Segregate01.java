import java.util.*;
public class Segregate01 {
    public static void main(String[] args) {
        Scanner j=new Scanner(System.in);
        int n=j.nextInt();
        int arr[]=new int[n];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=j.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<count)
            {
                arr[i]=0;
            }
            else{arr[i]=1;}
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       
    }
    
}
