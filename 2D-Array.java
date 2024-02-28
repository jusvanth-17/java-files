1.Maximum Element In The Matrix

A group of children playing in the garden. The old man needs help but he needs elder boy from the children . Help the old man to find the elder boy 
from that children. Write a program to find the maximum element in the matrix. Input Format: The input consists of (m*n+2) integers. The first 
integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The 
remaining integers correspond to the elements in the matrix. The elements are read in row wise order, first row first, then second row and so on. 
Assume that the maximum value of m and n is 10. Output Format: Refer sample output for details.
Example 1:

Input: 

 
3

2

4 5

6 9

0 3


Output:

9

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int m,n;
    m=s.nextInt();
    n=s.nextInt();
    int a[][]=new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        a[i][j]=s.nextInt();
      }
    }
    int k=a[0][0];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]>k){
          k=a[i][j];
        }
      }
    }
      
    
    System.out.print(k);
  }
}

2.Maximum Element In Each Row

There are some students in the class. The class Adviser needs a recruitment's process for above 60% students. In each and every row there was a 
student above 60% . Help your adviser to find the students in each row. Input Format: The input consists of (m*n+2) integers. The first integer 
corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining 
integers correspond to the elements in the matrix. The elements are read in row wise order, first row first, then second row and so on. Assume 
that the maximum value of m and n is 10. Output Format: Refer sample output for details.
Example 1:

Input: 

 
3

2

4 5

6 9

0 3


Output:

5

9

3
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n,m;
    n=s.nextInt();
    m=s.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j]=s.nextInt();
      }
    }
    int c1=a[0][0];
    for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
         if(a[i][j]>c1){
           c1=a[i][j];
         }
      }
      System.out.println(c1+"\n");
      c1=1;
    }
    }
}

3.Maximum Element In Each Column

In a family the people are arranged in rows and columns. Male persons in the families arranged in a row and females are arranged in a column. Find 
the biggest women in the each column.Help me to find the biggest women. Write a program to find the maximum element in each column of the matrix. 
Input Format: The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer 
corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in row 
wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10. Output Format: Refer sample output for 
details.
Example 1:

Input: 

 
3

2

4 5

6 9

0 3


Output:

6 

9

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n,m;
    n=s.nextInt();
    m=s.nextInt();
    int a[][]=new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        a[i][j]=s.nextInt();
      }
    }
    int max=-1;
      for(int i = 0; i < n; i++){
            max = -1;
            for(int j = 0; j < m; j++){
                max = Math.max(max, a[j][i]);     
            }
            System.out.println(max+" ");
            if(i < n-1)
            System.out.print('\n');
        }
    }
}

4.Matrix Sum

Shobitha and Siddhesh were playing puzzles. They are having two puzzles in their hand. They need to join the puzzle to get the correct puzzle. Help 
them to find the puzzle. Input Format: The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix 
and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The 
elements are read in row-wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10. Output Format: 
Refer sample output for details.
Example 1:

Input: 

 
3

2

4 5

6 9

0 3


Output:

27
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int r,c,sum=0;
    r=m.nextInt();
    c=m.nextInt();
    int a[][]=new int [r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=m.nextInt();
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        sum+=a[i][j];
      }
    }
    System.out.print(sum);
  }
}

5.Magic Square

A magic square is an arrangement of numbers (usually integers) in a square grid, where the numbers in each row, and in each column, and the numbers 
in the forward and backward main diagonals, all add up to the same number. Write a program to find whether a given matrix is a magic square or not. 
Input Format: The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining 
integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that 
the maximum value of m and n is 5. Output Format: Print "yes" if it is a magic square. Print "no" if it is not a magic square.
Example 1:

Input: 

 
3
2 7 6
9 5 1
4 3 8


Output:

yes

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = m.nextInt();
            }
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += a[0][j];
        }
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += a[i][j];
                colSum += a[j][i];
            }
            if (rowSum != sum || colSum != sum) {
                System.out.println("no");
                return;
            }
        }
        int diagSum1 = 0;
        for (int i = 0; i < n; i++) {
            diagSum1 += a[i][i];
        }
        if (diagSum1 != sum) {
            System.out.println("no");
            return;
        }
        int diagSum2 = 0;
        for (int i = 0; i < n; i++) {
            diagSum2 += a[i][n - 1 - i];
        }
        if (diagSum2 == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

6.Diagonal Matrix

 A square matrix which has zeros everywhere other than the main diagonal. Entries on the main diagonal may be any number, including 0. Write a 
 program to find whether a given matrix is a diagonal matrix or not. Input Format: The input consists of (n*n+1) integers. The first integer 
 corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read 
 in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5. Output Format: Print yes if it is a 
 diagonal matrix. Print no if it is not a diagonal matrix.
Example 1:

Input: 

 
3
1 0 0
0 2 0
0 0 3


Output:

yes

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
          a[i][j]=m.nextInt();
        }
    }
    int c=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
          if(a[i][j]!=0)
            c++;
       }
      }
    if(c==n){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}

7.Upper Triangular Matrix

An upper triangular matrix is a square matrix in which all the elements below the diagonal are zero. That is, all the non-zero elements are in the 
upper triangle: Write a JAVA program to find whether a given matrix is an upper triangular matrix or not. Input Format: The input consists of (n*n+1)
integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix.
The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5. Output Format: 
Print "yes" if it is an upper triangular matrix . Print "no" if it is not an upper triangular matrix.
Example 1:

Input: 

 
2

1 2

0 3


Output:

yes

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=m.nextInt();
      }
    }
    int c=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[1][0]==0){
          c++;
        }
      }
    }
    if(c!=0){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}


8.Lower Triangular Matrix
Medium
0
A lower triangular matrix is a square matrix in which all the elements above the diagonal are zero. That is, all the non-zero elements are in the 
lower triangle: Write a JAVA program to find whether a given matrix is a lower triangular matrix or not. Input Format: The input consists of (n*n+1)
integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix.
The elements are read in row wise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5. Output Format: 
Print "yes" if it is a lower triangular matrix . Print "no" if it is not a lower triangular matrix.
Example 1:

Input: 

 
2

1 0

2 3


Output:

yes

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=m.nextInt();
      }
    }
    int c=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[0][1]==0){
          c++;
        }
      }
    }
    if(c!=0){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
  }
}

9.Matrix Addition

Raju has a square shaped puzzle made up of small square pieces containing numbers on them. He wants to rearrange the puzzle by changing the element 
of a row into a column element and column element into a row element without altering the shape of the puzzle. Help raju to solve this puzzle. 
INPUT FORMAT: Enter the row and column of a matrix Enter the matrix OUTPUT FORMAT: Addition of a matrix FUNCTIONAL REQUIREMENTS: int** 
createArray(int,int); int getElement(int**,int,int); int addMatrix(int**,int**,int**,int,int);

Example 1:

Input: 

 
2 2 1 2 3 4 


Output:

2 4 6 8

import java.util.*;
class Main{
  public static void main(String args[]){
  Scanner m=new Scanner(System.in);
    int r,c;
    r=m.nextInt();
    c=m.nextInt();
    int a[][]=new int [r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=m.nextInt();
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        System.out.print(a[i][j]+a[i][j]+" ");
      }
    }
  }
}