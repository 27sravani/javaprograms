import java.io.*;
import java.util.*;
import java.lang.*;
class Solution8
{
   public void sumDigits(String s)
   {
      int sum=0;
      for(int i=0;i<s.length();i++)
      {
          char c=s.charAt(i);
          if(Character.isDigit(c))
          {
             String s1=new String();
             s1=s.substring(i,i+1);
             sum=sum+Integer.parseInt(s1);
          }
      }
      System.out.println(sum);
   }
}
public class TestSolution8
{
   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the string");
      String str=br.readLine();
      Solution8 obj=new Solution8();
      obj.sumDigits(str);
   }
}