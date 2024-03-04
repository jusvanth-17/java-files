Print-Series 1
Write a C program to generate the following series 101, 103, 107, 109….

Example 1:

Input: 

 
8


Output:

101
103
107
109
113
127
131
137

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int k=m.nextInt();
    int low=100, high=200, i, n;
    int cnt=1;
  while ( k>=cnt) {
     n = 0;
      for (i = 2; i <= low / 2; ++i) {z
         if (low % i == 0) {
            n = 1;
           break;
         }
      }
      if (n == 0){
         System.out.printf("%d\n", low);
        cnt+=1;
      }
      ++low;
   }
  }
}

Series-2
Write a C program to generate the following series 6, 9, 14, 21, 30….

Example 1:

Input: 

 
5


Output:

6 9 14 21 30

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    int a=6,b=3;
    for(int i=0;i<n;i++){
      System.out.print(a+" ");
      a+=b;
      b+=2;
    }
  } 
}

Series-3
Write a C program to generate the following series 0, 3, 8, 15, 24….

Example 1:

Input: 

 
5


Output:

0 3 8 15 24

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int i,n,a=0,b=3;
    n=m.nextInt();
    for(i=0;i<n;i++){
      System.out.print(a+" ");
      a+=b;
      b+=2;
    }
  }
}

Series-4
Write a C program to generate the following series 7, 5, 8, 6, 9…. SAMPLE INPUT & OUPUT:
Example 1:

Input: 

 
5


Output:

7 5 8 6 9
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
  int n;
  n=m.nextInt();
  int i,c=7,d=5;
    System.out.print(c+" ");
    System.out.print(d+" ");
  for(i=3;i<=n;i++){
    if(i%2==1){
      c+=1;
      System.out.print(c+" ");
    }else{
      d+=1;
      System.out.print(d+" ");
    }
  }
  }
}

Series-5
Write a C program to generate the following series 1, 2, 3, 5, 8….
Example 1:

Input: 

 
5


Output:

1 2 3 5 8

 import java.util.*;
class Main{
public static void main(String args[]){
  Scanner m=new Scanner(System.in);
  int n,i,a=1,b=2;
  n=m.nextInt();
  System.out.print(a+" "+b+" ");
  for(i=3;i<=n;i++){
    int c=a+b;
    System.out.print(c+" ");
    a=b;
    b=c;
  }
}
}

Series-6
Write a C program to generate the following series 2, 4, 7, 12, 21…
Example 1:

Input: 

 
5


Output:

2 4 7 12 21

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int i,n,pr=2;
    n=m.nextInt();
    System.out.print(pr+" ");
    for(i=0;i<n-1;i++){
      pr=(pr*2)-i;
      System.out.print(pr+" ");
    }
  }
}

Series-7
Write a C program to generate the following series 1, 4, 27, 256…
Example 1:

Input: 

 
5


Output:

1 4 27 256 3125

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,j;
    n=m.nextInt();
    for(i=1;i<=n;i++){
      int k=1;
      for(j=1;j<=i;j++){
        k=k*i;
      }
      System.out.print(k+" ");
    }
  }
}

Series-8
Write a C program to generate the following series 10, 5, 60, 15, 110…
Example 1:

Input: 

 
5


Output:

10 5 60 15 110

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int i,n,a=10,b=5;
    n=m.nextInt();
    for(i=1;i<=n;i++){
      if(i%2!=0){
        System.out.print(a+" ");
        a+=50;
      }else{
        System.out.print(b+" ");
        b+=10;
      }
    }
  }
}

Series-9
Write a C program to generate the following series 1, 4, 27, 16, 125…
Example 1:

Input: 

 
5


Output:

1 4 27 16 125

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i;
    n=m.nextInt();
    for(i=1;i<=n;i++)
    {
      if(i%2!=0){
        System.out.print(i*i*i+" ");
      }else{
        System.out.print(i*i+" ");
      }
    }
  }
}

Series-10
Write a C program to generate the following series 0, 2, 6, 12, 20….
Example 1:

Input: 

 
5


Output:

0 2 6 12 20

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,c=0,d=2;
    n=m.nextInt();
    for(i=1;i<=n;i++){
      System.out.print(c+" "); 
      c+=d; 
      d+=2; 
    }
  }
}


