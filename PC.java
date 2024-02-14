class Product{
    int pid;
    float price;
     String name;
     Product()
     {
         System.out.println("-----------");
         System.out.println("-----------");
     }
     void setproductdetails(int pid ,float price,String name)
     {
         this.pid=pid;
         this.price=price;
         this.name=name;
     }
     void showdetails()
     {
         System.out.println("pid:"+this.pid);
         System.out.println("price:"+this.price);
         System.out.println("Name:"+this.name);
     }
}
public class PC {
          public static void main(String args[])
          {

              Product p1=new Product();
              p1.setproductdetails(101,90000,"samsung");
              p1.showdetails();
              Product p2=new Product();
              p2.setproductdetails(102,70000,"Iphone");
              p2.showdetails();

          }

}
