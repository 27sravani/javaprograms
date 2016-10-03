import java.io.*;
import java.util.*;
import java.lang.*;
class Solution4
{
   public void backAround(String s)
   {
      int l;
      l=s.length();
      char c=s.charAt(l-1);
      StringBuilder sb=new StringBuilder(" ");
      sb.append(c);
      sb.append(s);
      sb.append(c);
      System.out.println(sb.toString());
   }
}
public class TestSolution4
{
   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the string");
      String str=br.readLine();
      Solution4 obj=new Solution4();
      obj.backAround(str);
   }
}