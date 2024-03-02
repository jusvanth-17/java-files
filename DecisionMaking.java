Automorphic Number:
Janu is very interested in mathematics and she loves to solve math puzzles daily. Her friend knows that and she asks her to find out what an automorphic 
number is and to implement that concept using C programming. But since Janu is not good at programming, you need to help her implement this concept. 
An automorphic number is a number whose square ends with the number itself. For example, 5 is an automorphic number as 5*5 =25. 
The last digit is 5 which is the same as the given number. It has only positive single digit numbers. If the number is not valid, 
it should display "Invalid input". If it is an automorphic number display “Automorphic Number” else display “Not Automorphic Number”. 
INPUT FORMAT: Input consists of 1 integer.

Example 1:

Input: 

 
7


Output:

Not Automorphic Number

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,k;
    n=m.nextInt();
    k=n*n;
    if(k%10==n){
      System.out.print("Automorphic Number");
    }else{
      System.out.print("Not Automorphic Number");
    }
  }
}

Savings and Expenses:
Ramu after finishing his degree joined a company in Bangalore. His manager has told him that he will get an increment if he works hard. 
As he belongs to a middle-class family, he wants to plan the budget according to his salary. He stays in a hostel. His expenses are hostel fees, 
bank loan interest. He wants to find out whether he can save any money or he wants to work hard or his salary will be able to manage his expenses alone. 
Help him in calculating the budget. INPUT & OUTPUT FORMAT: Input consists of 5 integers. First input corresponds to salary, second input corresponds to 
the amount he pays to the bank, third input corresponds to hostel fees, fourth input corresponds to food expenses and fifth input corresponds to the amount 
he sends to his parents. If he can save money out of his expenses display “He can save the money” or if he can manage his expenses alone display 
“He can manage the expenses” or else display “He wants to work hard”.

Example 1:

Input: 

 
10000
5000
4000
1500
5000


Output:

He has to work hard

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int sal,ban,fee,food,send;
    sal=m.nextInt();
    ban=m.nextInt();
    fee=m.nextInt();
    food=m.nextInt();
    send=m.nextInt();
    int r=ban+fee+food+send;
    if(sal-r>0){
      System.out.println("He can save the money");
    }else{
      System.out.println("He has to work hard");
    }
  }
}

Game-with-shapes:
Karl loves to play with shapes and his sister is interested in Mathematics. They got a wooden box which is square in shape with length x cm and a 
round bangle with radius r cm and decided to play with it. They started playing and his sister asked him to find whether the circle will fit into 
the square. Help Karl to find whether the circle will fit into a square or not. If the circle fits, display “circle can be inside a Square” else 
display “circle cannot be inside a Square”. INPUT FORMAT: Input consist of 2 integers. First input corresponds to the radius of a circle. Second 
input corresponds to the length of a square.
Example 1:

Input: 

 
77

65


Output:

circle cannot be inside a Square

 

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int r,l;
    r=m.nextInt();
    l=m.nextInt();
    if(r>l){
      System.out.println("circle cannot be inside a Square");
    }
    else{
      System.out.println("circle can be inside a square");
    }
  }
}

Cricket:
Tom is crazy about cricket. He was watching India vs. Australia World cup final match. Australia won the toss and elected to bat first. They 
finished batting with a score of X. Next, India started to bat and scored Y runs in N number of balls. As Tom is very crazy, he wants to calculate 
the run rate and check whether there is a probability for India to win or not. Help him calculate the run-rate and check the probability. 
INPUT FORMAT & OUTPUT FORMAT: Input consists of 4 integers. First input corresponds to the total number of balls. Second input corresponds to 
the total number of runs. Third input corresponds to the number of runs scored. Fourth input corresponds to the number of balls bowled. First 
output corresponds to the total number of overs. Second output corresponds to the total number of overs finished. Third output corresponds to the 
current run rate. Fourth output corresponds to total run rate. Overs: 50 Overs finished: 7.3 Current Run rate: 10.7 Total Run rate: 7.5 Eligible 
to Win
Example 1:

Input: 

 
300

375

78

45


Output:

50 7.3 10.7 7.5 Eligible to Win

code:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c, d, e, g;
        float f;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
      
        e = (int) ((float) a / 6);
        System.out.print(e+" ");
        g = d / 6;
        f = (d % 6);
        f = (f * 0.1f) + g;

        System.out.printf("%.1f ", f);
        System.out.printf("%.1f ", (float) c / f);
        System.out.printf("%.1f ", (float) b / e);

        if ((float) c / f > (float) b / e)
            System.out.print("Eligible to Win");
        else
            System.out.print("Not Eligible to Win");
    }
}

Boating:
You went on a tour to Ooty with your friends. As a part of the tour, you went boating with them. For the boat to remain stable, the number of people on one 
boat is restricted based on the weight of the people. You find that the boatman who is sailing your boat is so much greedy of money. For earning more, he 
takes too many people to travel in the boat at a time. So you want to check how many people can travel in the boat at a time so that the boat will not drown. 
Calculate the weight by considering the number of adults and number of children. Assume that an adult weighs 75 kg and children weigh 30 kg each. If the 
weight is normal, display Boat is stable, else display Boat will drown. INPUT & OUTPUT FORMAT: Input consists of 3 integers. First input corresponds to the 
weight that the boat can handle. Second input corresponds to the number of adults. Third input corresponds to the number of children.

Example 1:

Input: 

 
340
2
3


Output:

Boat is stable

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int w,a,c;
    w=m.nextInt();
    a=m.nextInt();
    c=m.nextInt();
    a=a*75;
    c=c*30;
    int n=a+c;
    if(n<=w){
      System.out.println("Boat is stable");
    }else{
      System.out.println("Boat will drown");
    }
  }
}

Calendar:
Damu and Ram are friends. They felt very bored and decided to play a game with calendar and number of days. Damu will give the month and the year as input, 
and Ram has to find out the number of days in that month. Write a C program using switch case to help Ram find the answer. You should check whether the 
given year is a leap year. If it is a leap year, it will have 29 days in February.(Use only switch case and implement the “Fall Through” concept). 
INPUT FORMAT: Input consists of 1 integer.
Example 1:

Input: 

 
3

1996


Output:

Number of days is 31

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    int m,y;
    m=n.nextInt();
    y=n.nextInt();
    switch(m){
      case 1:case 3:case 5:case 7:case 8:case 10:case 12:
        System.out.println("Number of days is 31");
        break;
      case 4:case 6:case 9:case 11:
        System.out.println("Number of days is 30");
        break;
      case 2:
        if(y%4==0||y%100!=0||y%400==0){
          System.out.println("Number of days is 28");
        }
        else{
          System.out.println("Number of days is 29");
        }
    }
  }
}

Stationary Shop:
Raj starts a new stationery shop. He wants to calculate the number of items that are sold and the number of items that are remaining in the stock. 
Whenever a customer asks for them, he will be able to quickly check whether the item is already sold or available. If the item is not available, it 
should display "Out of stock". If it is available, it should display the remaining number of items available and the total cost that should be paid 
by a customer. If the number of items asked by the customer is greater than the items available, it should display the number of items currently 
available. For example, if a customer asks 8 scales and only 3 scales are available, display "Only 3 scale are available". 
INPUT & OUTPUT FORMAT: Input consists of 1 string and 3 integers. First input corresponds to the item name. Second input corresponds to the number of 
items available in the stock. Third input corresponds to the amount of one item. Fourth input corresponds to the number of items asked by the customer.
Example 1:

Input: 

 
pencil

10

15

5


Output:

75 5

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    int i,amt,c;
    String name;
    name=n.next();
    i=n.nextInt();
    amt=n.nextInt();
    c=n.nextInt();
    if(i>c)
      System.out.println(amt*c+" "+c);
    else
      System.out.println("Out of stock");
  } 
}

Treasure Finder:
Lucy and Tina are close friends. They both are studying in the same school. Now they are on their summer vacation. As they are bored, they ask their parents
to take them to an exhibition. There Lucy and Tina play a game. In this game, there are three boxes with some number written on their top. There is a treasure
in one of the three boxes and the treasure is present in the box with the second largest number on its top. Also, to open the box, they need to decode the 
correct code of this box. The clue given to them to find the code is that it is the largest number which divides all the three given numbers. So, now help 
Lucy and Tina to decode the code. INPUT & OUTPUT PROGRAM: Input consists of three integers. First input corresponds to the number of the first box. Second 
input corresponds to the number of the second box. Third input corresponds to the number of the third box.
Example 1:

Input: 

 
2

4

6


Output:

The treasure is in the box which has number 4.
The code to open the box is 2.

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    int a,b,c,min,max,s;
    a=n.nextInt();
    b=n.nextInt();
    c=n.nextInt();
    if(a>b){
      if(c>b){
        max=a;
      }else if(b>c){
        max=b;
      }else{
        max=c;
      }
    }
    else if(b>c){
      max=b;
    }else if(c>b){
      max=c;
    }
    else{
      max=a;
    }
    if(a==max){
      if(b<c){
        s=c;
      }else{
        s=b;
      }
    }
    else if(b==max){
      if(a<c){
        s=c;
      }else{
        s=a;
      }
    }
    else{
      if(a<b){
        s=b;
      }else{
        s=a;
      }
    }
    System.out.printf("The treasure is in the box which has number %d.\n",s);
    if(a<s){
      min=a;
      if(b%min==0 && c%min==0){
        System.out.printf("The code to open the box is %d.",a);
      }
    }else if(b<s){
      min=b;
      if(a%min==0 && c%min==0)
        System.out.printf("The code to open the box is %d.\n",b);
    }else{
      min=c;
      if(b%min==0 && a%c==0){
        System.out.printf("The code to open the box is %d.\n",c);
      }
    }
  }
}

Tank:
Bala has a cylindrical tank in which he has to fill water in certain hours. For every one hour, his house will receive N liters of water from the 
corporation. Find out whether he will be able to fill the tank with water in X hours. The radius and height of the cylinder are given as the input. 
INPUT & OUTPUT FORMAT: Input consists of 4 float values. First input corresponds to the radius of the tank. Second input corresponds to the height 
of the tank. Third input corresponds to the amount of water the tank receives every hour. Fourth input corresponds to the total number of hours the 
tank receives water.
Example 1:

Input: 

 
5

7

100

6


Output:

The tank can be filled within 6.0 hours

code:
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        final double pi = 3.14;
        Scanner in = new Scanner(System.in);
        double radius , height , volume , waterPerHour , hours ;
        radius = in.nextDouble();
        height = in.nextDouble();
        waterPerHour = in.nextDouble();
        hours = in.nextDouble();
        volume = pi * radius * radius * height;
        if((volume/waterPerHour) < hours){
            System.out.printf("The tank can be filled within %.1f hours", hours);
        }else{
            System.out.printf("The tank cannot be filled within %.1f hours", hours);
        }
    }
}

Price Discount:

Chris is going to celebrate his birthday in January. His father wants to buy a new dress for his son. Also as Christmas is approaching, he wants to 
buy a new dress for Christmas as well. As all the textile showrooms offer a discount in the month of December, his father decides to buy a dress for 
Chris birthday in December itself. Before that, he wants to know how much discount was given in each month. In the first month of the year, they 
offered a 20% discount. In the third and fourth month, they offered a 10% discount. In the sixth and seventh month, they offered a 75% discount. 
In the tenth and eleventh month, they offered a 30% discount. In the twelfth month, they offered a 35% discount. Implement this program using switch
case. Note: Use Fall through concept. INPUT & OUTPUT PROGRAM: Input consists of 2 integers. First input corresponds to the rate of dress. Second 
input corresponds to the month in which they will shop. If an invalid month is given, it should display “Invalid Month”.

Example 1:

Input: 

 
1000
1


Output:

Chris father needs to pay Rs.800.00

code:
import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner n=new Scanner(System.in);
    int rate;
    int m;
    float o;
    rate=n.nextInt();
    m=n.nextInt();
    switch(m){
      case 1:
         o=rate*0.20f;
        System.out.printf("Chris father needs to pay Rs.%.2f",rate-o);
        break;
      case 3:case 4:
         o=rate*0.10f;
        System.out.printf("Chris father needs to pay Rs.%.2f",rate-o);
        break;
      case 6:case 7:
         o=rate*0.75f;
        System.out.printf("Chris father needs to pay Rs.%.2f",rate-o);
        break;
      case 11:
        o=rate*0.30f;
        System.out.printf("Chris father needs to pay Rs.%.2f",rate-o);
        break;
      case 12:
        o=rate*0.35f;
        System.out.printf("Chris father needs to pay Rs.%.2f",rate-o);
        break;
      case 2:case 8:case 5:case 9:case 10:
        o=rate;
        System.out.printf("Chris father needs to pay Rs.%.2f",o);
        break;
    }
  }
}