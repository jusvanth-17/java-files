import java.util.*;
class matrixaddition{
  public static void main(String args[]){
  Scanner in=new Scanner(System.in);
  int r=in.nextInt();
  int c=in.nextInt();
  int a[][]=new int[r][c];
  int b[][]=new int[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      {
        a[i][j]=in.nextInt();
      }
  }
 for(int i=0;i<r;i++)
   {
     for(int j=0;j<c;j++)
     {
       System.out.print(a[i][j]+a[i][j]+" ");
     }
   }

}
}