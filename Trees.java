1.Insert

Problem statement: Implementation of binary search tree : Write a Program to implement a binary search tree. Input Format The input should have numbers (until the user enters a negative value) Output Format The output prints the tree values.
Example 1:

Input: 

 
6
3
2
1
4
7
8
9
10
-1


Output:

Tree values are:
1 2 3 4 6 7 8 9 10 


import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root;
    BST(){
        this.root=null;
    }
    void insert(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }else{
            Node temp=root;
            while(true){
                if(newNode.data<temp.data){
                    if(temp.left==null){
                        temp.left=newNode;
                        break;

                    }else{
                        temp=temp.left;
                    }
                }else if(newNode.data>temp.data){
                    if(temp.right==null){
                        temp.right=newNode;
                        break;

                    }else{
                        temp=temp.right;
                    }
                }
            }

        }

    }
    void print(){
        printorder(this.root);
    } void printorder(Node root){
        if(root==null){
            return;
        }
        printorder(root.left);
        System.out.print(root.data+" ");
        printorder(root.right);
    }
}

class Main{
public static void main(String args[]){
        Scanner m=new Scanner(System.in);
         int n=m.nextInt();
          BST b=new BST();
          while(n>0){
               b.insert(n);
               n=m.nextInt();
           }
       System.out.println("Tree values are:");
         b.print();
}
}

 2.MAX

Problem statement: Binary tree - Find Max Write a C++ program to find the maximum element in the tree. Input Format The input should have numbers (until the user enters a negative value) Output Format The output prints the maximum element.
Example 1:

Input: 

 
6
3
1
4
2
-1


Output:

Maximum element is 6

import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root;
    BST(){
        this.root=null;
    }
    void insert(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }else{
            Node temp=root;
            while(true){
                if(newNode.data<temp.data){
                    if(temp.left==null){
                        temp.left=newNode;
                        break;

                    }else{
                        temp=temp.left;
                    }
                }else if(newNode.data>temp.data){
                    if(temp.right==null){
                        temp.right=newNode;
                        break;
 }else{
                        temp=temp.right;
                    }
                }
            }

        }

    }
    void print(){
        printorder(this.root);
    } void printorder(Node root){
        if(root==null){
            return;
        }
        printorder(root.left);
        System.out.print(root.data+" ");
        printorder(root.right);
    }
}

class Main{
public static void main(String args[]){
        Scanner m=new Scanner(System.in);
         int n=m.nextInt();
          BST b=new BST();
          while(n>0){
               b.insert(n);
               n=m.nextInt();
           }
       System.out.println("Maximum element is "+Countval(b.root));
}

  static int Countval(Node node){
       Node current=node;
       while(current.right!=null){
           current=current.right;
}
return current.data;

}
}

3.Traversal-1

Problem statement: Inorder traversal: Write a program to display the elements of trees in the inorder traversal. Input Format The input should have numbers (until the user enters a negative value) Output Format The output prints the inorder traversal.
Example 1:

Input: 

 
6
3
1
4
2
10
9
7
8
-1


Output:

Inorder Traversal:
1 2 3 4 6 7 8 9 10 

import java.util.*;
class Node{
     int data;
  Node left;
  Node right;
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
}
class BST{
  Node root;
  BST(){
    this.root=null;
  }
  void insert(int data){
    
    Node newNode=new Node(data);
    if(root==null){
      root=newNode;
    }else{
      Node temp=root;
      while(true){
        
        if(newNode.data<temp.data){
          if(temp.left==null){
            temp.left=newNode;
            break;
          }else{
            temp=temp.left;
          }
        }else if(newNode.data>temp.data){
          if(temp.right==null){
            temp.right=newNode;
            break;
}else{
            temp=temp.right;
          }
        }
      }
    }
  }
  void print(){
    printorder(this.root);
  }
  void printorder(Node root){
    if(root==null){
      return;
    }
    printorder(root.left);
    System.out.print(root.data+" ");
    printorder(root.right);
  }
}
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
    BST b=new BST();
    
    while(n!=-1){
      b.insert(n);
      n=m.nextInt();
    }
   System.out.println("Inorder Traversal:");
   b.print();
  }
}

4.Traversal-2

Problem statement: Preorder traversal Write a program to display the elements of tree in the preorder traversal. Input Format The input should have numbers (until the user enters a negative value) Output Format The output prints the preorder traversal.
Example 1:

Input: 

 
6
3
1
4
2
-1


Output:

Preorder Traversal:
6 3 1 2 4 

import java.util.*;
class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
}
class BST{
  Node root;
  BST(){
    this.root=null;
  }
  void insert(int data){
    Node newNode=new Node(data);
    if(root==null){
      root=newNode;
    }else{
      Node temp=root;
      while(true){
        if(newNode.data<temp.data){
          if(temp.left==null){
            temp.left=newNode;
            break;
          }else{
            temp=temp.left;
          }
        }else if(newNode.data>temp.data){
          if(temp.right==null){
            temp.right=newNode;
            break;
          }else{
            temp=temp.right;
}
        }
      }
    }
  }
  void print(){
    printpre(root);
  }
  void printpre(Node root){
    if(root==null){
      return;
    }
    System.out.print(root.data+" ");
    printpre(root.left);
    printpre(root.right);
  }
}
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n=m.nextInt();
    BST b=new BST();
    while(n>0){
      b.insert(n);
      n=m.nextInt();
    }
    System.out.println("Preorder Traversal:");
    b.print();
  }
}

5.Traversal-3

Binary Search Tree - Postorder Problem statement Create a binary search tree consisting of only positive values & print the postorder traversal of the same. Note An infinite line of integer input represents the nodes of the binary search tree. If any value less than 1 is encountered, the input loop has to break and print the postorder traversal of the tree. Example Input 2 3 1 -1 Output 1 3 2 Explanation 2 is the root of the Binary tree. 3 is the right child of 2 and 1 is the left child of 2. Hence the preorder traversal is 1 3 2, which follows the rule Left Right Right. Input Format Read a line of integers. Output Format Postorder traversal of the binary tree.
Example 1:

Input: 

 
2 3 1 -1


Output:

1 3 2

import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root;
    BST(){
        this.root=null;
    }
    void insert(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }else {
            Node temp = root;
            while (true) {
                if (newNode.data < temp.data) {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                } else if (newNode.data> temp.data) {
                    if(temp.right==null){
                        temp.right=newNode;
                        break;
                    }else{
                        temp=temp.right;
}
                }
            }
        }
    }
    void display(){
        displaypost(this.root);
    }
void displaypost(Node root){
    if(root==null){
        return;
    }

    displaypost(root.left);
    displaypost(root.right);
    System.out.print(root.data+" ");
}
}

public class Main {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        BST b=new BST();
        int n=m.nextInt();
        while(n>0){
            b.insert(n);
          n=m.nextInt();
        }
        b.display();
    }
}


6.Height

Binary Search Tree - Height Problem statement Create a binary search tree consisting of only positive values & print the height of the tree. Note An infinite line of integer input representing the nodes of the binary search tree. If any value less than 1 is encountered, the input loop has to break and print the height of the tree. Example Input 2 3 1 0 Output 1 Explanation This BST has 2 levels in it. 2 is the root and 3 and 1 are the right and left child respectively. Hence the height is 1.
Example 1:

Input: 

 
2 3 1 4 0


Output:

2

7.Sum of LeafNodes

Binary Search Tree - Sum of leaf nodes Problem statement Create a binary search tree consisting of only positive values & print the sum of leaf nodes in the tree. Note An infinite line of integer input represents the nodes of the binary search tree. If any value less than 1 is encountered, the input loop has to break and print the sum of leaf nodes in the tree. Example Input 2 3 1 -1 Output 4 Explanation 2 is the root and 3 and 1 are the children of 2. So the sum of leaf nodes is 3+1 = 4. Input Format Read a line of integers. Output Format Sum of leaf nodes in the tree.
Example 1:

Input: 

 
4 2 6 1 3 5 7 -9


Output:

16

 