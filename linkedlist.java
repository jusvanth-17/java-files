class node{
  int data;
  node next;
  node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
class linkedList
{
    node head;
    linkedList()
    {
      this.head=null;
    }
  void addfirst(int data)
  {
     node newnode=new node(data);
     newnode.next=head;
     head=newnode;
  }
  void print()
  {
    node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data);
        temp=temp.next;
    }
   }
}
public class linkedlist {
   public static void main(String args[])
   {
    linkedList l=new linkedList();
    l.addfirst(40);
    l.addfirst(50);
    l.addfirst(0);
    l.print();

   }
}
