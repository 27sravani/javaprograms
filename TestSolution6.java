import java.io.*;
import java.util.*;
import java.lang.*;
class Solution6
{
   public void embedWord(String s1,String s2)
   {
      StringBuilder sb=new StringBuilder(s1);
      sb.insert(s1.length()/2,s2);
      System.out.println(sb.toString());
   }
}
public class TestSolution6
{
   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the first string");
      String str1=br.readLine();
      System.out.println("enter the second string");
      String str2=br.readLine();
      Solution6 obj=new Solution6();
      obj.embedWord(str1,str2);
   }
}