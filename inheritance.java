import java.util.*;
class shape {
    int l,b,a,r;
}
class rect extends shape{
    void setvalue(int l,int b){
        this.l=l;
        this.b=b;
    }
    void areaR()
    {
        System.out.println("Area of rectangle "+l*b);
    }
}
class circle extends shape{
    void setvalue(int r){
        this.r=r;
    }
    void areaC(){
        System.out.println("Area of circle "+3.14*r*r);
    }
}
class square extends shape{
     void setvalue(int a){
         this.a=a;
     }
     void areaS(){
         System.out.println("Area of square "+a*a);
    }
}
public class inheritance
{
    public static void main(String args[])
    {
        square sq=new square();
        sq.setvalue(10);
        sq.areaS();

        circle c=new circle();
        c.setvalue(5);
        c.areaC();

        rect r=new rect();
        r.setvalue(5,6);
        r.areaR();
    }
}
