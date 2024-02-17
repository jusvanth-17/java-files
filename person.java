
interface printables{
    void print();
   
}
class printer implements printables
{
    public void print(){
    System.out.println("printer");
    }
}
class scanner implements printables
{
    public void print(){
    System.out.println("Scanner");
    }
}
class fax implements printables
{
   public void print()
   {
    System.out.print("fax"); 
   }
}
class Document
{
    private printables device;
    Document(printables device)
    { 
      this.device=device;  
    }
    public void printdoc()
    {
        this.device.print();
    }
}
class person{
    public static void main(String args[]){
     printables printer=new printer();
     printables scanner=new scanner();
     printables fax=new fax();

     Document d1=new Document(printer);
     Document d2=new Document(scanner);
     Document d3=new Document(fax);

    d1.printdoc();
    d2.printdoc();
    d3.printdoc();
    }
}