import java.io.*;
import java.util.*;
class Sum
{
   int sum=0;
   public int sum3(int a[],int n)
   {
      for(int i=0;i<n;i++)
      {
         sum=sum+a[i]; 
      }
      return sum;
   }
}
public class ArraySum
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      Sum s=new Sum();
      int a[]=new int[n];
      System.out.println("enter "+n+" array elements");
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      int sum=s.sum3(a,n);
      System.out.println(sum);
   }
}