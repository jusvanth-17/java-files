1.Function Overloading
Easy
NaN
Write a program to implement function overloading. Ram is given two or three input as an integer,if he has two integers then add the two numbers. If he has three input,then multiply the three numbers. Function Header: public void fun1(int a,int b,int c) public void fun1(int a,int b) Input Format First line represents the number of elements(N) followed by the elements separated by the single space. If the number of the elements exceed 2 or 3, then display message as WRONG INPUT. Output Format Display the sum,if there are two integers or Displays product,if there are three integers.
Example 1:

Input: 

 
2 14 56


Output:

70

 import java.util.*;
class Ram{
  public void fun1(int a,int b){
    System.out.println(a+b);
  }
   public void fun1(int a,int b,int c){
     System.out.println(a*b*c);
   }
}
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
    Ram r=new Ram();
    int a,b,c;
    switch(n){
      case 2:
         a=m.nextInt();
         b=m.nextInt();
        r.fun1(a,b);
        break;
      case 3:
         a=m.nextInt();
         b=m.nextInt();
         c=m.nextInt();
        r.fun1(a,b,c);
    }
    }
}

2.METHOD OVERLOADING

Create a class named 'Hello'. Define a method 'sayHello' Create an object obj. Call method 'sayHello' without argument, Output should display 'Hello'. Call method 'sayHello' with one argument, Output should display 'Hello 'argument value'' (Ex: If the argument passed is 'John' Output should display 'Hello John') Input Format The input contains a string. Output Format The first line of the output should display 'Hello' The second line of the output should display 'Hello 
'
Example 1:

Input: 

 
John


Output:

Hello
Hello John

import java.util.*;
class Hello{
  void sayHello(){
    System.out.println("Hello");
  }
  void sayHello(String str){
    System.out.println("Hello "+str);
  }
}
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
      String str=m.next();
    Hello s=new Hello();
    s.sayHello();
    s.sayHello(str);

  }
}

3.Dynamic Polymorphism

Write a program to illustrate dynamic polymorphism, create two classes Vehicle and Motorbike. Motorbike inherits the Vehicle class. Create a method move() in base class that takes a string as input and print them. Override the method move() in derived class that also takes a string as input and prints them. Input Format Input two strings in separate line Output Format Displays the string after execution. Refer sample output
Example 1:

Input: 

 
move fast 
vehicles


Output:

vehicles
move fast

 import java.util.*;
class Vehicle{
  void move(String a){
    System.out.println(a);
  }
}
class Motorbike extends Vehicle{
  void move(String a){
    System.out.println(a);
  }
}
  class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    String a=m.nextLine();
    String b=m.nextLine();
    Motorbike m1=new Motorbike();
    m1.move(b);
    Vehicle v=new Vehicle();
    v.move(a);
  }
  }