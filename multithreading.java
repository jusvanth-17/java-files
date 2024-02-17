class Printer{
    public void printDoc(int page,String name)
    {
     for(int i=0;i<page;i++)
     {
         System.out.println("Printing "+i+" page for "+name);
     }
    }
 }
 class sciencethread extends Thread{
     Printer p;
     sciencethread(Printer p )
     {
        this.p=p;
     }
     public void run()
     {
         this.p.printDoc(7,"science");
     }
 
 }
 class mathsthread extends Thread
 {
     Printer p;
     mathsthread(Printer p)
     {
      this.p=p;
     }
     public void run()
     {
          this.p.printDoc(5,"Maths");
     }
 }
 class multithreading{
     public static void main(String args[])
     {
         Printer p1=new Printer();
         sciencethread s1=new sciencethread(p1);
         mathsthread m1=new mathsthread(p1);
         m1.start();
         s1.start();
 
         
     }
 }
 
 