import java.util.*;
class collection{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList a1=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a1.add(in.next());
        }
        Iterator i=a1.iterator();
        while(i.hasNext()){
           if(i.next().equals("adam")){
            i.remove();
           }
        }
        for(Object ir:a1){
         System.out.println(ir);
        }
    }
}