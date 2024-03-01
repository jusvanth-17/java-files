1.Maximum Element in an Array

You are playing the PUBG game and you entered into the Bootcamp. There you viewed the drop box which was filled with guns. you have to choose the biggest gun in the drop box. Find the biggest gun and you will get the chicken dinner. Input Format: Input consists of n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the array. Assume that the maximum value of n is 15. Output Format: Refer sample output for details.
Example 1:

Input: 

 
5

2

3

6

8

1


Output:

8 is the maximum element in the array

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n,a[]=new int[100],i,j,max=0;
    n=in.nextInt();
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    for(i=0;i<n;i++){
      for(j=i+1;j<n;j++){
        if(a[j]>max)
          max=a[j];
      }
    }
    System.out.print(max+" is the maximum element in the array");
  }
}

2.Sum of 2 arrays

Ramu have some number of Apples and he arrange that in a matrix format. Raju have some another number of Apples. He also wants to arrange that in a matrix format. Ragul wants to calculate the total number of apples. Help him to find out the total number of apples. Input Format: Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15. Output Format: Refer sample output for details.
Example 1:

Input: 

 
5

2

3

6

8

1

1

1

1

1

1


Output:

3 4 7 9 2

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,a[],b[],r[];
    n=m.nextInt();
    a=new int[n];
    b=new int[n];
    r=new int[n];
    for(int i=0;i<n;i++){
      a[i]=m.nextInt();
    }
    for(int j=0;j<n;j++){
      b[j]=m.nextInt();
    }
    for(int k=0;k<n;k++){
     int z=a[k]+b[k];
      System.out.print(z+" ");
    }
  }
}

3.Compatible array

Write a program to find whether 2 arrays are Compatible or Incompatible. Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all the values of i. INPUT FORMAT: Input consists of 2n+1 integers. The first integer corresponds to ‘n’, the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15. OUTPUT FORMAT: Refer sample output for details.
Example 1:

Input: 

 
5

2

3

6

8

1

1

1

1

1

1


Output:

Compatible

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        if (isCompatible(arr1, arr2)) {
            System.out.println("Compatible");
        } else {
            System.out.println("Incompatible");
        }
    }

    private static boolean isCompatible(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

4.Search an element

Arun's teacher gave him the following challenge. Help him solve it. "Given an array with 'n' elements by a user, you need to search if a particular element is present in the array or not. The element to be searched for is also given by the user" Input Format: Input consists of n+2 integers. The first integer corresponds to ‘n’, the size of the array. The next ‘n’ integers correspond to the elements in the array. The last integer corresponds to ‘a’, the element to be searched. Output Format: Refer to sample output for details.
Example 1:

Input: 

 
5

2

3

6

8

1

6


Output:

6 is present in the array

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,a[],r,c=0;
    n=m.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=m.nextInt();
    }
    r=m.nextInt();
    for(int i:a){
      if(i==r){
        System.out.print(r+" is present in the array");
        c=1;
      }
    }
      if(c==0){
        System.out.print(r+" is not present in the array");
      }
    
  }
}

5.Distinct elements

Write a program to find the number of distinct elements in an unsorted array. [Do it without sorting the array] Input Input: Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next n integers correspond to the elements in the array. Assume that the maximum value of n is 15. Output Format: Output consists of a single integer which corresponds to the number of distinct elements in the array.
Example 1:

Input: 

 
5

3

2

3

780

90


Output:

4

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
      int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=m.nextInt();
    }
    int c=0;
    for(int i=0;i<n;i++){
      boolean dis=true;
      for(int j=0;j<i;j++){
        if(a[i]==a[j]){
        dis=false;
          break;
        }
        
      }
    if(dis){
      c++;
     }
   }
    System.out.println(c);
  
  }
}

6.Array median

Write a program to find the median of the elements in the array. Median is the middle value in the sorted list. If there are an even number of elements in the list, the median is the mean of the 2 middle values. Input Format: Input consists of n+1 integers where n corresponds to the number of elements in the array. The first integer corresponds to n and the next n integers correspond to the elements in the array. Output consists of a double value which corresponds to the median of the array and is printed up to 2 digits of precision. Assume that the maximum number of elements in the array is 20. Output Format: Refer sample input and output for formatting specifications.
Example 1:

Input: 

 
5

2

4

1

3

5


Output:

The median of the array is 3.00

import java.util.*;
class Main{
     static void Insertion(int a[],int n){
       int key,j,i;
       for(j=1;j<n;j++){
             key=a[j];
             i=j-1;
         while(i>=0&&a[i]>key){
           a[i+1]=a[i];
           i=i-1;
         }
         a[i+1]=key;
             }
       
       for(int k=0;k<n;k++){
         if(k==n/2){
         System.out.print("The median of the array is "+a[k]+".00");
         }
       }
     }  
  
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    int arr[]=new int [n];
    for(int i=0;i<n;i++){
      arr[i]=m.nextInt();
    }
    Insertion(arr,n);
  }
}

7.Functions – Array Type

Write a program to find the type of array using functions. An array is said to be “Even” if all the elements in the array are even. An array is said to be “Odd” if all the elements in the array are odd. An array is said to be “Mixed” if it contains some odd elements and some even elements. Refer function specifications for the function details. The first argument corresponds to the number of elements in the array. The second argument corresponds to the pointer to an array. The return value of the function should be 1 if the array is Even. The return value of the function should be 2 if the array is Odd. The return value of the function should be 3 if the array is Mixed. Input Format: Input consists of n+1 integers where n corresponds to the number of elements in the array. The first integer corresponds to n and the next n integers correspond to the elements in the array. Assume that the maximum number of elements in the array is 20. Sample Output: Refer sample input and output for formatting specifications.
Example 1:

Input: 

 
5

2

4

1

3

5


Output:

The array is Mixed

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();  
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=m.nextInt();
    }
    int even=0,odd=0;
    for(int i=0;i<n;i++){
      if(a[i]%2==0){
        even++;
      }else if(a[i]%2==1){
        odd++;
      }
    }
      if(even==n){
        System.out.print("The array is Even");
      }else if(odd==n){
        System.out.print("The array is Odd");
      }else {
        System.out.print("The array is Mixed");
      }
    
  }
}

8.Insert an element

Write a C program to insert an element in an array at the given position. If the position where the element is to be inserted is greater than the size of the array display “Invalid Input”. FUNCTIONAL REQUIREMENTS: int insert(int*,int,int,int); int* createarray(int); int getelements(int*,int); INPUT FORMAT: Input consists of 3 integers and 1 array. The first integer corresponds to the size of the array. The second integer corresponds to the position where the element is to be inserted. The third integer corresponds to the element to be inserted.

Example 1:

Input: 

 
5 1 2 3 4 5 4 10


Output:

1 2 3 10 4 5

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
            int n=m.nextInt();
            int a[]=new int[n];
         for(int i=0;i<n;i++){
           a[i]=m.nextInt();
          }
        int p=m.nextInt();
        int e=m.nextInt();
        int size = a.length;
        int arr[] = insert(a, size, p, e);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] insert(int arr[], int size, int position, int element) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid input");
            return arr;
        }
        int[] newArr = new int[size + 1];
        System.arraycopy(arr, 0, newArr, 0, size);
        for (int i = newArr.length - 1; i > position - 1; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[position - 1] = element;
        return newArr;
    }
}

9.Count Odd and Even

Write a C program to count the number of even and odd elements in an array. First input will be the number of elements FUNCTIONAL REQUIREMENTS: int countEven(int , int *); int countOdd(int , int *);.

Example 1:

Input: 

 
3
1
2
3


Output:

Odd: 2
Even: 1

import java.util.*;
class Main{
  static void countEven(int x){
    System.out.println("Even: "+x);
  }
  static void countOdd(int y){
    System.out.println("Odd: "+y);
  }
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,a[],x=0,y=0;
    n=m.nextInt();
    a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=m.nextInt();
    }
    for(int i=0;i<n;i++){
      if(a[i]%2==0){
        x+=1;
      }else{
        y+=1;
      }
    }
    countOdd(y);
    countEven(x);
  }
}

10.Sum of Positive Square Elements

Write a C program to find the sum of positive square elements in an array. INPUT FORMAT: Input consists of 1 integer and 1 array. Integer corresponds to the size of the array. FUNCTIONAL REQUIREMENTS: int sumPositive(int, int *);

Example 1:

Input: 

 
3
2
4
6


Output:

4

import java.util.*;
class Main{
  static void sumPositive(int c){
    System.out.println(c);
  }
  public static void main(String arg[]){
    Scanner m=new Scanner(System.in);
    int n,a[];
    n=m.nextInt();
    a=new int[n];
    int c=0;
    for(int i=0;i<n;i++){
      a[i]=m.nextInt();
    }
    int s[]={1,4,9,16,25,36,47,64,89,100};
    for(int i=0;i<n;i++){
      for(int j=0;j<10;j++){
      if(a[i]==s[j]){
        c+=a[i];
    }
    }
    }
    sumPositive(c);
  }
}

