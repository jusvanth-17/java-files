import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data)
    {
      this.data=data;
      this.next=null;
    }
}
class Linkesdlist
{

  Node head;
  Linkesdlist()
  {
   this.head=null;
  }
  void addfirst(int data){
    Node newnode=new Node(data);
    newnode.next=head;
    head=newnode;
  }
  void addlast(int data){
   Node newnode=new Node(data);
   if(head==null)
   {
     head=newnode;
   }
   else{
     Node temp=head;
     while(temp.next!=null)
     {
       temp=temp.next;
     }
     temp.next=newnode;

   }
  }
  void delfirst()
  {
   if(head==null)
   {
     System.out.print("Linked list is empty");
   }
   else
   {
     head=head.next;
   }
  }
 void dellast()
 {
   if(head==null)
   {
     System.out.print("Linked list is empty");
   }
   else if(head.next==null)
   {
     head=null;
   }
   else{
     Node temp=head;
     while(temp.next.next!=null)
     {
       temp=temp.next;
     }
     temp.next=null;
   }
 }
  void print()
  {
   Node temp=head;
   while(temp!=null)
   {
     System.out.print(temp.data+" ");
     temp=temp.next;
     
   }
  }
 }

  class SinglyLinkedList{
  public static void main(String[] args) {
      Scanner j=new Scanner(System.in);
      System.out.println("1.Insert at begining \n2.Insert at end \n3.Traverse LinkedList \n4.Delete at first\n4.Delete at last\n 5 Exit");
      System.out.print("Enter the operation you want to perform: ");
    int n=j.nextInt();
    Linkesdlist l1=new Linkesdlist();
    switch(n)
    {
     case 1:
        System.out.println("Adding element at first:");
        int af=j.nextInt();
        l1.addfirst(af);
        break;

     case 2:
         System.out.println("Adding element at last:");
         int al=j.nextInt();
         l1.addlast(al);
         break;
     case 3:
        System.out.println("Traversing element :");
        l1.print();
        break;
     case 4:
        System.out.println("Delete at first: ");
        l1.delfirst();

     case 5: 
        System.out.println("Delete at last: ");
        l1.dellast();

     case 6:
         System.out.println("Exited successfully");
       
    
    }
  }
  }