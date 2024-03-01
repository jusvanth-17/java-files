1.Abstraction 1
Create an abstract class Shape with the following methods abstract void rectangleArea(); abstract void squareArea(); abstract void circleArea(); Create a class Area that extends Shape that calculates and prints all the area. Create a Main class, get the inputs and pass it to the methods. Input Format The first line of the input consists of the length and breadth. The second line consists of the side. The third line consists of the radius. Output Format The output prints the area of rectangle, square, and circle. Refer sample input and output for formatting specifications. Round off the area of the circle to two decimal places.
Example 1:

Input: 

 
10 20
4
5


Output:

200
16
78.54

import java.util.*;
abstract class Shape{
  abstract void rectangleArea(int l,int b);
  abstract void squareArea(int l);
  abstract void circleArea(int r);
}
class Area extends Shape{
  void rectangleArea(int l,int b){
    System.out.println(l*b);
  }
  void squareArea(int l){
    System.out.println(l*l);
  }
  void circleArea(int r){
    System.out.printf("%.2f",Math.PI*r*r);
  }
}
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int l=m.nextInt();
    int w=m.nextInt();
    int a=m.nextInt();
    int r=m.nextInt();
    Area a1=new Area();
    a1.rectangleArea(l,w);
    a1.squareArea(a);
    a1.circleArea(r);
  }
}

2.Abstraction 2

create an abstract class marks with the following method void getPercentage(); Create a class A that extends marks and has 3 attributes marks1, marks2, and marks3 and a method getPercentage that calculates and prints the percentage of the student. Create a class B that extends marks and has 4 attributes marks1, marks2, marks3, and marks4 and a method getPercentage that calculates and prints the percentage of the student. Round off the output to two decimal places. Input Format The first line of the input consists of three integers i.e., the marks scored by student A. The second line of the input consists of four integers i.e., the marks scored by student B. Output Format The first line prints the percentage of A. The second line prints the percentage of B.
Example 1:

Input: 

 
95 85 75
85 77 92 93


Output:

85.00
86.75

import java.util.*;
class A{
   float marks1;
  float marks2;
  float marks3;
  void getPercentage(float m1,float m2,float m3){
    this.marks1 = m1;
    this.marks2 = m2;
    this.marks3 = m3;
  }
  void print(){
    System.out.printf("%.2f\n",(this.marks1+this.marks2+this.marks3)/3);
  }
   }
class B extends A{
  float marks1;
  float marks2;
  float marks3;
  float marks4;
  void getPercentage(float m4,float m5,float m6,float m7){
    this.marks1=m4;
    this.marks2=m5;
    this.marks3=m6;
    this.marks4=m7;
}
  void print(){
    System.out.printf("%.2f",(this.marks1+this.marks2+this.marks3+this.marks4)/4);
  }
}
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int m1=m.nextInt();
    int m2=m.nextInt();
    int m3=m.nextInt();
   
}

3.Abstraction 3

Write a program to find the sum of divisors using the concept of abstract classes. Create an abstract class "AbstractClass" which contains abstract methods getValue() and divisorSum(int n). Then write a class called Calculator which extends the abstract class. getValue(): Method need's to get input from the user. divisorSum(int n): Method get's "n" as parameter and returns the sum of the numbers divisor. Eg: Divisor of number 4 is 1, 2, 4. Output is 1+2+4 = 7 Input Format The input consists of a number. Output Format The output prints the sum of its proper divisors.
Example 1:

Input: 

 
4


Output:

7


import java.util.Scanner;

abstract class AbstractClass{
  int num, sum;
  abstract void getValue();
  abstract void divisorSum(int n);
}
class Calculator extends AbstractClass{
  void getValue(){
    System.out.println(this.sum);
  }
  void divisorSum(int n){
    sum = 1;
    for(int i = 2; i <= n/2; i++){
        if(n % i == 0) sum+=i;
    }
    if(sum > 1) sum += n;
  }
}

class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Calculator c = new Calculator();
    c.num = in.nextInt();
    c.divisorSum(c.num);
    c.getValue();
  }
}
