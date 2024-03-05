1.Write a program to print the below pattern Input Format:Number of rows to be printed--->4 Output Format: Pattern 1 1 2 1 2 3 1 2 3 4
Example 1:

Input: 

6

Output:

1
12
123
1234
12345
123456

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

2.Write a program to print the below pattern Input Format:Number of rows to be printed--->5 Output Format: Pattern 5 5 4 5 4 3 5 4 3 2 5 4 3 2 1
Example 1:

Input: 
 
3

Output:

3
32
321

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
  int i,j,n;
  Scanner m=new Scanner(System.in);
  n=m.nextInt();
  for(i=n;i>=1;i--){
    for(j=n;j>=i;j--){
      System.out.print(j);
    }
    System.out.println();
  }
  }
}

3.write a program to print the following pattern input format:4 output format:. 4444 333 22 1
Example 1:

Input: 
 
5

Output:

55555
4444
333
22
1

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=n;i>=1;i--){
      for(j=1;j<=i;j++){
        if(j!=i)
        System.out.print(i+"");
      else
          System.out.print(i);
      
      }
      System.out.println();
    }
  }
}

4.write a program to print the following pattern input format:4 output format:. 1 2 1 3 2 1 4 3 2 1
Example 1:

Input: 
 
7

Output:

1
21
321
4321
54321
654321
7654321

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=0;j<=i-1;j++){
        System.out.print(i-j);
      }
      System.out.println();
    }
  }
}

5.write a program to print the following pattern input format:4 output format:. 1234 234 34 4
Example 1:

Input: 
 
6

Output:

123456
23456
3456
456
56
6

code:
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=i;j<=n;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

6.write a program to print the following pattern input format:4 output format: 1 23 456 78910
Example 1:

Input: 

5

Output:

1
23
456
78910
1112131415

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    int c=1;
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.printf("%d",c);
        c++;
      }
      System.out.println();
    }
  }
}

7.write a program to print the following pattern input format:4 output format: 4 34 234 1234
Example 1:

Input: 
 
6

Output:

6
56
456
3456
23456
123456

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=n;i>=1;i--){
      for(j=i;j<=n;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

8.write a program to print the following pattern input format:4 output format: 1 10 101 1010
Example 1:

Input: 
 
8

Output:

1
10
101
1010
10101
101010
1010101
10101010

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        if(j%2==0)
          System.out.print("0");
        else
          System.out.print("1");
      }
      System.out.println();
    }
  }
}

9.write a program to print the following pattern input format:4 output format: 2 24 246 2468
Example 1:

Input: 

5

Output:

2
24
246
2468
246810

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.print(j*2);
        }
      System.out.println();
    }
  }
}

10.Write a program to print the below pattern Input Format:Number of rows to be printed--->4 Output Format: Pattern 1357 135 13 1
Example 1:

Input: 
 
6

Output:

1357911
13579
1357
135
13
1

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    int i,j,n;
    Scanner m=new Scanner(System.in);
    n=m.nextInt();
    for(i=n*2;i>=1;i-=2){
      for(j=1;j<=i;j+=2){
        System.out.print(j);
      }
      System.out.println();
    }
  }
    
}

11.Write a program to print the following pattern
Example 1:

Input: 
 
5

Output:

    5
   45
  345
 2345
12345

 code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,j,k; 
      n=m.nextInt();
    for(i=n;i>=1;i--)
    {
        for(k=i-1;k>=1;k--)
        {
            System.out.printf(" ");
        }

        for(j=i;j<=n;j++)
        {
            System.out.printf("%d",j);
        }
        System.out.println();
    }
  }
}

12.Write a program to print the following pattern
Example 1:

Input: 
 
4

Output:

   1
  12
 123
1234

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,j,k;
    n=m.nextInt();
    for(i=1;i<=n;i++){
      for(j=n-1;j>=i;j--){
        System.out.print(" ");
      }
      for(k=1;k<=i;k++){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}

13.Write a program to print the following pattern
Example 1:

Input: 
 
6

Output:

     6
    65
   654
  6543
 65432
654321

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    for(int i=n;i>=1;i--){
      for(int j=i;j>1;j--){
        System.out.print(" ");
      }
      for(int k=n;k>=i;k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}

14.Write a program to print the following pattern
Example 1:

Input: 
 
5

Output:

a
ab
abc
abcd
abcde

code: 
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,i,j;
    n=m.nextInt();
    for(i=0;i<n;i++){
      for(j=0;j<=i;j++){
        System.out.printf("%c",97+j);
      }
      System.out.println();
    }
  }
}

15.Write a program to print the following pattern
Example 1:

Input: 

7

Output:

2
23
235
2357
235711
23571113
2357111317

 
code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,count=0;
    n=m.nextInt();
    boolean flag=true;
    int a[]=new int [n];
    for(int i=2;count<n;i++){
      flag=true;
      for(int j=2;j<=i/2;j++){
        if(i%j==0){
          flag=false;
          break;
        }
      }if(flag){
        a[count]=i;
        count++;
      }
    }for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(a[j]);
      }
      System.out.println();
    }
  }
}