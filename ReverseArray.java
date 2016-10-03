import java.io.*;
import java.util.*;
class Reverse
{
   public int[] reverseN(int a[],int n)
   {
      System.out.println("the reversed array elements are:");
      int j=0,b[];
      b=new int[n];
      for(int i=n-1;i>=0;i--)
      {
         b[j]=a[i];
         j++;
      }
      return b;
   }
}
public class ReverseArray
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      Reverse r=new Reverse();
      int a[]=new int[n];
      System.out.println("enter "+n+" array elements");
      for(int i=0;i<n;i++)
      {
         a[i]=sc.nextInt();
      }
      int c[]=r.reverseN(a,n);
      for(int i=0;i<n;i++)
      {
         System.out.println(c[i]);
      }
   }
}