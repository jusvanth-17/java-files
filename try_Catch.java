public class trycatch {
    static void fun() throws ArithmeticException
    {
        throw new ArithmeticException("Hi");
    }
    public static void main(String args[])
    {
     try
     {
        fun();
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
     finally{
            System.out.print("EEEE");
     }
    }
}