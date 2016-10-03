import java.io.*;
import java.util.*;
class Solution1
{
    int a,b;
    public void sameLast(int x,int y)
    {
       if((x%10)==(y%10))
           System.out.println("true");
       else
           System.out.println("false");
    }
}
public class TestSolution1
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       Solution1 obj=new Solution1();
       System.out.println("enter the a value");
       int a=sc.nextInt();
       System.out.println("enter the b value");
       int b=sc.nextInt();
       obj.sameLast(a,b);
   }
}