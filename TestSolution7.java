import java.io.*;
import java.util.*;
import java.lang.*;
class Solution7
{
   public void makeTags(String s1,String s2)
   {
      String s3=new String(" ");
      s3=s3+buildOpenTag(s1);
      s3=s3+s2;
      s3=s3+buildCloseTag(s1);
      System.out.println(s3);
   }
   public String buildOpenTag(String s)
   {
      String s4=new String(" ");
      s4="<"+s+">";
      return s4;
   }
   public String buildCloseTag(String s)
   {
      String s4=new String(" ");
      s4="</"+s+">";
      return s4;
   }
}
public class TestSolution7
{
   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the first string");
      String str1=br.readLine();
      System.out.println("enter the second string");
      String str2=br.readLine();
      Solution7 obj=new Solution7();
      obj.makeTags(str1,str2);
   }
}