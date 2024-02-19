import java.util.*;
class overload{
  public void fun1(int a,int b,int c)
  {
	System.out.println(a*b*c);
  }
  public void fun1(int a,int b)
  {
	System.out.print(a+b);
  }
}
class functionoverloading{
  public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	if(n>2)
	{
	  overload o=new overload();
	  int a=in.nextInt();
	  int b=in.nextInt();
	  int c=in.nextInt();
	  o.fun1(a,b,c);
	}
	else
	{
	   overload o=new overload();
	   int a=in.nextInt();
	   int b=in.nextInt();
	   o.fun1(a,b);
	}
  }
}
