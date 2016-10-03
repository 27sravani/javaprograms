import java.io.*;
import java.util.*;
class Solution2
{
   public void greet()
   {
      System.out.println("Hello World.....!");
   }
}
public class TestSolution2
{
   public static void main(String args[])
   {
      Solution2 obj=new Solution2();
      obj.greet();
      Solution2 obj1=new Solution2();
      obj1.greet();
   }
}