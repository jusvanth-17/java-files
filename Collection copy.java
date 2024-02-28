ArrayList

Create a class ArrayListMain and in the main method get the names and store them in an ArrayList. After getting all the names, just display them in the same order. Input Format Number of names(N) in first line as integer N names in separate lines Output Format Print the names
Example 1:

Input: 

 
6
KL Rahul
Hetmyer
Pierre
Dube
Walsh
Pant


Output:

KL Rahul
Hetmyer
Pierre
Dube
Walsh
Pant

import java.util.*;
class Main{
public static void main(String args[]){
     Scanner m=new Scanner(System.in);
      int n=m.nextInt();
      m.nextLine();
      int i=0;
      ArrayList<String> a1=new ArrayList<String>();
  while(i<n){
      a1.add(m.nextLine());
      i++; 
     }
      Iterator<String> itr=a1.iterator();
     while(itr.hasNext()){
     System.out.println(itr.next()); 
          }
     }
}

2.ArrayList-1

Input a positive integer N (N > 0), input N strings, and sort the strings in place in the order of increasing length. Print the sorted strings using ArrayList as an implementation of the List interface for storing the individual strings. Input Format Input number of elements Input each string on a separate line Output Format Print the list of strings sorted by their length
Example 1:

Input: 

 
3
aa
b
ccc


Output:

[b, aa, ccc]

import  java.util.*;
class Main{
  public static void main(String args[]){
    ArrayList<String> a1=new ArrayList<String>();
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
    m.nextLine();
    for(int i=0;i<n;i++){
        a1.add(m.nextLine());
      }
    Collections.sort(a1, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    System.out.println(a1);
  }
}

3.Frequency

While entering user names, We have to be very careful about the duplicate entries in the list. To make a correct and perfect report, we have to remove the duplicate elements in the list. Write a program that obtains a set of names and a search element and prints its frequency. Input Format The first line of the input consists of the number of names. The next input is the user names. The last input is the user name to be searched. Output Format The output prints the frequency of the searched element. Collections.frequency(names, search) use this function to get the frequency where first arguement is Arraylist object and second argument is the name to be searched it will return the frequency count
Example 1:

Input: 

 
5
alice
bob
ankit
alice
prajit
alice


Output:

2

import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int frequency= 0;
    ArrayList<String> a = new ArrayList<String>();
    for(int i = 0; i < n; i++){
      a.add(in.next());
    }
    String x = in.next();
     Iterator itr=a.iterator();
    while(itr.hasNext()){
      if(itr.next().equals(x)){
           frequency++;
          itr.remove();
       }
    }
    System.out.println(frequency);
  }
}

4.Equals

Equals method - Collections Let's dive deep into Set and explore its inbuilt functions. We usually perform equals operations to compare objects. Now try the same feature here. Experiment with the equals() method in this problem. Create Main class. Obtain two sets of numbers and check whether they are the same or not. Note: Strictly adhere to the Object-Oriented specifications given in the problem statement. All class names, attribute names, and method names should be the same as specified in the problem statement. Input Format The first line of the input consists of the value of n that represents the number of elements in both sets. The next input is the elements of the first set separated by a space. The third input is the elements of the second set separated by a space. Output Format The output prints whether the sets are same or different
Example 1:

Input: 

 
2
10 20
10 20


Output:

Both sets are same

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
    ArrayList a=new ArrayList();
    ArrayList b=new ArrayList();
    for(int i=0;i<n;i++){
      a.add(m.nextInt());
    }
    for(int i=0;i<n;i++){
      b.add(m.nextInt());
    }
    if(a.equals(b)){
      System.out.print("Both sets are same");
    }else{
      System.out.print("Both sets are different");
    }
  }
}

5.Duplicate

Input 2 lines of text with multiple words separated by spaces. Using HashSet as an implementation of Set, print the set of words found in both lines. Input Format Input 2 lines with some words in common. Output Format The set of common words. first second third third fourth first
Example 1:

Input: 

 
one two three
two four


Output:

[two]

import java.util.*;
@SuppressWarnings("unchecked")
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
     String l1=m.nextLine();
    String  l2=m.nextLine();
    String w1[]=l1.split(" ");
    String w2[]=l2.split(" ");
    Set s1=new HashSet();
    Set s2=new HashSet();
    for(String w:w1){
      s1.add(w);
    }
    for(String w:w2){
      s2.add(w);
    }
      Set s=new HashSet();
    for(String c1:w1){
        for(String c2:w2){
            if(c1.equals(c2)){
                  s.add(c1);
            }
        }
    }
      System.out.print(s);

  }
}

6.ArrayList-2

Using Java Library ArrayList as a List Interface implementation, input N integers from standard input and add to the list only if they form an increasing sequence. Take a number, N > 0 as input Accept N integers as input Add the number to the list only if it forms an increasing sequence else ignore Print the list Input Format Input number of elements, N > 0 Enter each integer on the next N lines Output Format List of integers in increasing sequence ignoring out of order elements
Example 1:

Input: 

 
7
3
5
9
1
11
7
13


Output:

[3, 5, 9, 11, 13]

7.Hall

Write a program to take hall objects as input in the list and sort them in the order of their costPerDay using the sort() method of the comparable interface. Then display them in tabular form. Create a class Hall with the following attributes showed in diagram, Mark the attributes as private and add appropriate getter/setter, default, and parameterized constructor. Override toString() and print the details in a tabular format. And implement comparable interface in the class. Create driver class Main and use the main method to get inputs, sort, and display. Input Format The first line has the number of halls n. The next n lines have details of the hall Output Format The output displays the hall details Refer sample output Collections.sort(halls); this function will be used to sort the collection if string it will be sorted in lexicographical order
Example 1:

Input: 

 
3
SDH hall
12345
12000.0
Jane           
XUV hall
24680
15000.0
Jack           
SRT hall
13579
20000.0
John


Output:

SDH hall 12345 12000.0 Jane
XUV hall 24680 15000.0 Jack
SRT hall 13579 20000.0 John

8.Cards

Playing cards during travel is a fun-filled experience. For this game, they wanted to collect all four unique symbols. Can you help these guys to collect unique symbols from a set of cards? Create Card class with attributes symbol and number. From our main method collect each card details (symbol and number) from the user. Collect all these cards in a set, since the set is used to store unique values or objects. Cards need to be compared with each other to identify whether both the cards are the same symbol. For this, we need to implement equals method to tell whether both the cards are same or not. Once we collect all four different symbols display the first occurrence of card details in alphabetical order. Input Format Input a card symbol Input a card number Repeat Output Format Four symbols gathered in N cards Cards in set
Example 1:

Input: 

 
a
2
b
1
a
1
c
3
d
5


Output:

Four symbols gathered in 5 cards
Cards in Set are: 
a 2
b 1
c 3
d 5

9.Books

Create a class named Book with the following private attributes. Include getters and setters. Include default and parameterized constructor. The format for the parameterized constructor is Public Book(int id, String name, String author, String publisher, int quantity) Create a Main class and in the main method get the details of the books and store them in the linked hash set. Display all the book details and search for a book name in the set. Input Format The first line of the input consists of the number of books. The next input is the book details. The last input is the book name to be searched. Output Format The output prints the book details. whether the element is present or not. Refer sample input and output.
Example 1:

Input: 

 
2
1
let us c
yashwanth
BPB
8
2
operating systems
galvin
wiley
6
data communication


Output:

1 let us c yashwanth BPB 8
2 operating systems galvin wiley 6
data communication is not present in the set

10.Symbols

Write a program to collect and store all the cards to assist the users in finding all the cards in a given symbol. This cards game consists of N number of cards. Get N number of cards details from the user and store the values in the Card object with the attributes symbol and number. Store all the cards in a map with the symbol as its key and a list of cards as its value. The map is used here to easily group all the cards based on their symbol. Once all the details are captured print all the distinct symbols in alphabetical order from the Map. For each symbol print all the card details, number of cards, and their sum respectively. Input Format Input number of cards, N >0 Input N card details as Card Symbol Card Number Output Format Distinct Symbols For each Symbol Cards in that Symbol Number of Cards in that Symbol Sum of numbers for that Symbol
Example 1:

Input: 

 
5
b
2
a
5
b
5
c
3
d
4


Output:

Distinct Symbols are: 
a b c d 
Cards in a Symbol:
a 5
Number of Cards: 1
Sum of Numbers: 5
Cards in b Symbol:
b 2
b 5
Number of Cards: 2
Sum of Numbers: 7
Cards in c Symbol:
c 3
Number of Cards: 1
Sum of Numbers: 3
Cards in d Symbol:
d 4
Number of Cards: 1
Sum of Numbers: 4

