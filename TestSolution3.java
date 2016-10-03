import java.io.*;
import java.util.*;
import java.lang.*;
class Solution3
{
   public void missingChar(String s,int n)
   {
       if(n<=s.length())
       {
           String str=new String(" ");
           str=s.substring(0,n);
           str=str+s.substring(n+1);
           System.out.println(str);
       }
       else
          System.out.println("index is out of bound");
   }
}
public class TestSolution3
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String str=br.readLine();
        System.out.println("enter the index value");
        int i=Integer.parseInt(br.readLine());
        Solution3 obj=new Solution3();
        obj.missingChar(str,i);
    }
}