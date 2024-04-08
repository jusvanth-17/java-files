import java.util.Scanner;

public class WeightedSubstring {
    public static void main(String[] args) {
       long arr[]=new long[27];
        arr[1]=1;
        for(int i=2;i<=26;i++){
            arr[i]=i*arr[i-1]+arr[i-1];
        }

        int n,index=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String str="";
        for(int i=26;i>=1;i--){
            if(arr[i]<n && arr[i]>0 && n>0){
                index=i;
                long val=n/(int)arr[i];
                for(int j=0;j<val;j++){
                    str=str+(char)(64+i);
                    n-=arr[i];
                }
            }
        }
        String str1="";
        int i=0,r=str.length()-1;
        while(r>=0){
            str1+=str.charAt(r);
            r--;
            i++;
        }
        System.out.println(str1);
        
    
    }
}
