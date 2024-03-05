1.Debt Repay

Alice wanted to start a business and she was looking for a venture capitalist. Through her friend Bob, she met the owner of a construction company who is interested to invest in an emerging business. Looking at the business proposal, the owner was very much impressed with Alice's work. So he decided to invest in Alice's business and hence gave a green signal to go ahead with the project. Alice bought Rs.X for a period of Y years from the owner at R% interest per annum. Find the rate of interest and the total amount to be given by Alice to the owner. The owner impressed by proper repayment of the financed amount decides to give a special offer of 2% discount on the total interest at the end of the settlement. Find the amount given back by Alice and also find the total amount. (Note: All rupee values should be in two decimal points). INPUT FORMAT: Input consists of 3 integers. The first integer corresponds to the principal amount borrowed by Alice. The second integer corresponds to the rate of interest The third integer corresponds to the number of years. OUTPUT FORMAT: The output consists of 4 floating point values. The first value corresponds to the interest. The second corresponds to the amount. The third value corresponds to the discount. The last value corresponds to the final settlement. All floating point values are to be rounded off to two decimal places
Example 1:

Input: 

 
100

1

10


Output:

10.00
110.00
0.20
109.80

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    float a,r;
    int y;
    a=m.nextFloat();
    r=m.nextFloat();
    y=m.nextInt();
    float i,amt,d,s;
    i=(a*r*y)/100;
    amt=a+i;
    d=(i*2)/100;
    s=amt-d;
    System.out.printf("%.2f\n",i);
    System.out.printf("%.2f\n",amt);
    System.out.printf("%.2f\n",d);
    System.out.printf("%.2f\n",s);
  }
}

2.Four musketeers

'Artagnan joined the group of 3 Musketeers and now their group is called four Musketeers. Meanwhile, d'Artagnan also moved to a new house in the same locality nearby to the other three. Currently, the houses of Athos, Porthos and Aramis are located in the shape of a triangle. When the three musketeers asked d'Artagnan about the location of his house, he said that his house is equidistant from the houses of the other 3. Can you please help them find out the location of the house? Given the 3 locations {(x1,y1), (x2,y2) and (x3,y3)} of a triangle, write a program to determine the point which is equidistant from all the 3 points. INPUT FORMAT: Input consists of 6 integers. The first integer corresponds to x1. The second integer corresponds to y1. The third and fourth integers correspond to x2 and y2 respectively. The fifth and sixth integers correspond to x3 and y3 respectively. OUTPUT FORMAT: The output consists of two floating point numbers (with one decimal place) which correspond to the location of the house.
Example 1:

Input: 

 
2

4

10

15

5

8 


Output:

5.7 9.0

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    float x1,x2,y1,y2,x3,y3;
    x1=m.nextFloat();
    y1=m.nextFloat();
    x2=m.nextFloat();
    y2=m.nextFloat();
    x3=m.nextFloat();
    y3=m.nextFloat();
    float x,y;
    x=(x1+x2+x3)/3;
    y=(y1+y2+y3)/3;
    System.out.printf("%.1f %.1f",x,y);
  }
}
3.Sports day Celebration

Training for sports day has begun and the physical education teacher has decided to conduct some team games. The teacher wants to split the students in higher secondary into equal sized teams. In some cases, there may be some students who are left out from the teams and he wanted to use the left out students to assist him in conducting the team games. For instance, if there are 50 students in a class and if the class has to be divided into 7 equal sized teams, 7 students will be there in each team and 1 student will be left out. That 1 student will assist the PET. With this idea in mind, the PET wants your help to automate this team splitting task. Can you please help him out? INPUT FORMAT: Input consists of 2 integers. The first integer corresponds to the number of students in the class and the second integer corresponds to the number of teams. OUTPUT FORMAT: The output consists of two integers. The first integer corresponds to the number of students in each team and the second integer corresponds to the students who are left out.
Example 1:

Input: 

 
60

8


Output:

7 4

 

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int s,t;
    s=m.nextInt();
    t=m.nextInt();
    int a,b;
    a=s/t;
    b=s%t;
    System.out.println(a+" "+b);
  }
}


4.The newspaper Agency

Each Sunday, a newspaper agency sells w copies of a special edition newspaper for Rs.x per copy. The cost to the agency of each newspaper is Rs.y. The agency pays a fixed cost for storage, delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate the profit which it obtains only on Sundays. Can you please help them out by writing a program to compute the profit if w, x, and y are given. INPUT FORMAT: Input consists of 3 integers: w, x, and y. w is the number of copies sold, x is the cost per copy and y is the cost the agency spends per copy. OUTPUT FORMAT: The output consists of a single integer which corresponds to the profit obtained by the newspaper agency.
Example 1:

Input: 

 
1000

2

1


Output:

900

 

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int w,x,y;
    w=m.nextInt();
    x=m.nextInt();
    y=m.nextInt();
    int a=(w*(x-y))-100;
    System.out.println(a);
     }
}


5.Sum of Two Numbers

Write a program to calculate the sum of two numbers.

Example 1:

Input: 

 
10
20


Output:

Sum: 30

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.printf("Sum: %d",a+b);
  }
}


6.The Chronicles of Narnia

Four kids Peter,Susan,Edmond and Lucy travel through a wardrobe to the land of Narnia. Narnia is a fantasy world of magic with mythical beasts and talking animals.While exploring the land of narnia Lucy found Mr.Tumnus the two legged stag ,and she followed it, down a narrow path .She and Mr.Tumnus became friends and he offered a cup of coffee to Lucy in his small hut.It was time for Lucy to return to her family and so she bid good bye to Mr.Tumnus and while leaving Mr.Tumnus told that it is quite difficult to find the route back as it was already dark.He told her to see the trees while returning back and said that the first tree with two digits number will help her find the way and the way to go back to her home is the sum of digits of the tree and that numbered way will lead her to the tree next to the wardrobe where she can find the others.Lucy was already confused, so pls help her in finding the route to her home.... Input Format: Input consists of an integer corresponding to the 2-digit number. Output Format: Output consists of an integer corresponding to the sum of its digits.
Example 1:

Input: 

 
87


Output:

15

 
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    int a,b;
    a=n%10;
    b=n/10;
    System.out.println(a+b);
  }
}


7.Treasure Hunter

Though there have been more successful pirates, Blackbeard is one of the best-known and widely-feared of his time. He commanded four ships and had a pirate army of 300 at the height of his career and defeated the famous warship, HMS “Scarborough” in sea-battle. He was known for barreling into battle clutching two swords with several knives and pistols at the ready. He captured over forty merchant ships in the Caribbean and without flinching killed many prisoners. Now, Blackbeard and his three pirates found a treasure of gold coins. Long Ben too joined them. They decided to share the treasure. Blackbeard agreed to give x% share for Long Ben. He then decided to take y% share from the remaining treasure. His other pirates will share the remaining gold coins equally. Write a program to compute their share's. INPUT FORMAT: Input consists of 3 integers. The first input corresponds to the number of gold coins in the treasure. The second input corresponds to Ben's share percentage and the last input is Blackbeard's share percentage. OUTPUT FORMAT: The output consists of three integers. The first output integer corresponds to Long Ben's share. The second integer corresponds to Blackbeard's share. The last integer corresponds to other pirates share.

Example 1:

Input: 

 
729
65
87


Output:

473
222
11

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n,x,y;
    n=m.nextInt();
    x=m.nextInt();
    y=m.nextInt();
    int lb,bb,tp;
    lb=(n*x)/100;
    bb=((n-lb)*y)/100;
    tp=(n-(lb+bb))/3;
    System.out.println(lb);
    System.out.println(bb);
    System.out.println(tp);
  }
}


8.The misers discount

Mrs.Bhulbhul is a miser to the core. She saves money even on petite things. One day she heard a discount offer announced in a mall. She wants to purchase a lot of items to save her money. The discount is given only when at least two items are bought. Since each item has different discount prices, she finds it difficult to check the amount she has saved. So she approaches you to device an automated discount calculator to make her easy while billing. INPUT FORMAT: Input consists of two floating point values denoting price of item1 and item2. The third input denotes the discount value in percentage. OUTPUT FORMAT: The output consists of three floating values denoting total amount, discounted price and amount saved.
Example 1:

Input: 

 
20.50 45.40 10 


Output:

65.90 59.31 6.59

 

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    float a,b,d;
    a=m.nextFloat();
    b=m.nextFloat();
    d=m.nextFloat();
    float dis,amt,s;
    dis=a+b;
    amt=dis-((dis*d)/100);
    s=(dis*d)/100;
    System.out.printf("%.2f %.2f %.2f",dis,amt,s);
  }
}


9.Cricket Stadium

There was a large ground in center of the city which is rectangular in shape. The Corporation decides to build a Cricket stadium in the area for school and college students, But the area was used as a car parking zone. In order to protect the land from using as an unauthorized parking zone , the corporation wanted to protect the stadium by building a fence. In order to help the workers to build a fence, they planned to place a thick rope around the ground. They also wanted to cover the entire ground with a carpet during rainy season. They wanted to buy only the exact length of the rope that is needed. They also wanted to buy only the exact quantity of carpet that is required. They requested your help. Can you please help them by writing a program to find the exact length of the rope and the exact quantity of carpet that is needed? Input format: Input consists of 2 integers. The first integer corresponds to the length of the ground and the second integer corresponds to the breadth of the ground. Output Format: Output Consists of two integers. The first integer corresponds to the length. The second integer corresponds to the quantity of carpet required.
Example 1:

Input: 

 
50 20


Output:

140 1000

 

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int l,h;
    l=m.nextInt();
    h=m.nextInt();
    int p,br;
    p=2*(l+h);
    br=l*h;
    System.out.println(p+" "+br);
  }
}

10.Booka the alien

Booka is an alien. He couldn't understand how to measure days, weeks, months and years. Make Booka understand what is meant by days, weeks, months and years. Teach him about the conversion of days into years, months and weeks using a program. INPUT FORMAT: Input consists of an integer which corresponds to the number of days. OUTPUT FORMAT: The output consists of three integers. The first integer corresponds to the total years. The second integer corresponds to the total weeks. The third integer corresponds to the total days.
Example 1:

Input: 

 
373


Output:

1 1 1

 

import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int d;
    d=m.nextInt();
    int y,rd,w,r;
    y=d/365;
    rd=d%365;
    w=rd/7;
    r=rd%7;
    System.out.print(y+" "+w+" "+r);
  }
}


