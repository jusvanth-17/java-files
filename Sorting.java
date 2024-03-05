1.Bubble sorting Algorithm
Medium
13
NaN
write a java program to sort an array using bubble sorting technique
Example 1:

Input: 

 
6
10 8 6 4 2 0


Output:

0 2 4 6 8 10

import java.util.*;
class Main{
    static void bubble(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int k=0;k<n-i-1;k++){
                if(a[k]>a[k+1]){
                    int key=a[k];
                    a[k]=a[k+1];
                    a[k+1]=key;
                }
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
        bubble(arr,arr.length);
    for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

2.Insertion Soring Algorithm

write a java program to sort an array using insertion sorting technique
Example 1:

Input: 

 
5
5 2 9 1 5


Output:

1 2 5 5 9

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
         System.out.print(a[k]+" ");
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
    /*for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }*/
  }
}

3.Merge Sorting Algorithm

write a program to implement merge sorting algorithm
Example 1:

Input: 

 
7
15 26 56 6 65 74 21


Output:

6 15 21 26 56 65 74

import java.util.*;
class Main{
  static void merge(int a[],int start,int end){
    if(start<end){
      int mid=(start+end)/2;
      merge(a,start,mid);
      merge(a,mid+1,end);
      merger(a,start,mid,end);
    }
  }
  public static void merger(int a[],int start,int mid,int end){
    int ls,rs;
    ls=mid-start+1;
    rs=end-mid;
    int la[]=new int[ls];
    int ra[]=new int[rs];
    for(int i=0;i<ls;i++){
      la[i]=a[i+start];
    }
    for(int j=0;j<rs;j++){
      ra[j]=a[mid+1+j];
    }
     int i=0,j=0,k=start;
    while(i<ls&&j<rs){
      if(la[i]<ra[j]){
        a[k++]=la[i++];
      }else{
        a[k++]=ra[j++];
      }
    }
    while(i<ls){
      a[k++]=la[i++];
    }
    while(j<rs){
      a[k++]=ra[j++];
    }
    
  }
public static void main(String args[]){
  Scanner m=new Scanner(System.in);
  int n;
  n=m.nextInt();
 int a[]=new int[n];
  for(int i=0;i<n;i++){
    a[i]=m.nextInt();
  }
  merge(a,0,n-1);
  
  for(int j=0;j<n;j++){
    System.out.print(a[j]+" ");
  }
}
}

4.Quick Sorting Algorithm

write a program to implement quicksort algorithm
Example 1:

Input: 

 
8
15 23 4 62 94 3 13 11


Output:

3 4 11 13 15 23 62 94

import java.util.*;
class Main{
  static int partition(int a[],int start,int end){
    int pivot=a[end];
    int pi=start-1;
    for(int i=start;i<end;i++){
      if(a[i]<pivot){
        ++pi;
        swap(a,i,pi);
      }
    }
    ++pi;
    swap(a,pi,end);
    return pi;
  }
  static void swap(int a[],int i,int j){
    int t;
    t=a[i];
    a[i]=a[j];
    a[j]=t;
  }
  static void quicksort(int a[],int start,int end){
    if(start<end){
      int pi=partition(a,start,end);
      quicksort(a,start,pi-1);
      quicksort(a,pi+1,end);
    }
  }
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=m.nextInt();
    }
}

5.Selection Sorting Algorithm

write a program to implement selection sorting algorithm
Example 1:

Input: 

 
5
25 15 10 5 0


Output:

0 5 10 15 25

import java.util.*;

public class Main {
    static void selection(int arr[],int n){
        int min;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,min,i);
        }
    }
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]){
        Scanner m=new Scanner(System.in);
        int n=m.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=m.nextInt();
        }
        selection(a,a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
