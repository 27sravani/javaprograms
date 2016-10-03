import java.io.*;
import java.util.*;
import java.lang.*;
class Solution5
{
   int c=0;
   String s1=new String();
   public void containE(String s)
   {
      s1=s;
      StringBuilder sb=new StringBuilder(s1);
      for(int i=0;i<sb.length();i++)
      {
         if(sb.charAt(i)=='e')
             c++;
      }
      if((c>=1) && (c<=3))
            System.out.println("true");
      else
          System.out.println("false");
   }
}
public class TestSolution5
{
    public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter the string");
       String str=br.readLine();
       Solution5 obj=new Solution5();
       obj.containE(str);
    }
}