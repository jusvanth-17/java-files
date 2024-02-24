import java.util.*;
class Node
  {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
      this. data=data;
      this.left=null;
      this.right=null;
    }
  }
class BST
{
    Node root;
    BST(){
      this.root=null;
    }
  void insert(int data){
    Node newnode=new Node(data);
    if(root==null){
        root=newnode;
    }
    else{
       Node temp=root;
       while(true)
       {
         if(newnode.data<temp.data)
         {
           if(temp.left==null)
           {
             temp.left=newnode;
             break;
           }
           else{
             temp=temp.left;
           }
         }
         else if(newnode.data>temp.data)
         {
           if(temp.right==null)
           {
             temp.right=newnode;
             break;
           }
           else{
             temp=temp.right;
           }
         }
       }
    }
}
  void display(){
    displayrec(this.root);
  }
  void displayrec(Node root){
    
       if(root==null){
           return;
        }
        displayrec(root.left);
        System.out.print(root.data + " ");
     displayrec(root.right);
    }
}


class tree{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();       
        BST b1=new BST();
        while(n >0)
        {
            b1.insert(n);
            n=in.nextInt();
        }
        System.out.println("Tree values are: ");
     b1.display();
  }
}
