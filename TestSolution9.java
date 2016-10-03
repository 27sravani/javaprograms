import java.io.*;
import java.util.*;
import java.lang.*;
class Solution9
{
   public void maxBlock(String s)
   {
      int maxc=0,c=0;
      if(s.length()==0)
          System.out.println(maxc);
      else if(s.length()==1)
          System.out.println(++maxc);
      maxc++;
      c++;
      for(int i=1;i<s.length();i++)
      {
         if(s.charAt(i)==s.charAt(i-1))
         {
             c++;
             if(c>maxc)
                 maxc=c;
         }
         else
             c=1;
      }
      System.out.println(maxc);
   }
}
public class TestSolution9
{
   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the string");
      String str=br.readLine();
      Solution9 obj=new Solution9();
      obj.maxBlock(str);
   }
}