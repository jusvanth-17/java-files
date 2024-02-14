class ABC
{
    final int a=10;
    ABC(int a,int b)
    {
        System.out.println(a+b);
    }
    void f1(){
        System.out.println(a);
    }
    ABC(){
        this(2,3);

        System.out.println("HELLO");

    }
}


public class polymorphism {
         public static  void  main(String args[]){
         ABC a1=new ABC(2,4);
         ABC a2=new ABC();
         a1.f1();
}
}



