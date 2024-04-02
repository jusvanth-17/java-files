import java.util.*;
public class Anagram {
    // public static void main(String[] args) {
    //     Scanner in=new Scanner(System.in);
    //     String s1=in.nextLine();
    //     String s2=in.nextLine();
    //     char arr[]=s1.toCharArray();
    //     char arr1[]=s2.toCharArray();
    //     int found=0;
    //     if(s1.length()==s2.length());
    //     {
    //         for(int i=0;i<s1.length();i++)
    //         {
    //             for(int j=0;i<s2.length();j++)
    //             if(arr[i]==arr1[j]){
    //              found++;
    //              break;
    //             }
    //         }
    //     }
    //     if(s1.length()==found)
    //        System.out.println("Anagram ");
    //     else
    //       System.out.println("Not anagram ");
    // }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        int j=0,k=0;
        for(int i=0;i<a.length();i++)
           j+=(int)a.charAt(i);
        for(int l=0;l<b.length();l++)
           k+=(int)b.charAt(l);
        if(j==k)
          System.out.println("Anagram");
        else
         System.out.println("Not anagram");

    }
}
