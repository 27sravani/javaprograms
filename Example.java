import java.io.*;
import java.util.*;
import java.lang.*;
public class Example
{
   public static void main(String args[])
   {
       String str="Coding ";
       str=str+"is very interesting";
       System.out.println(str);
       StringBuilder sb=new StringBuilder(str);
       sb.append(" in ").append("java");
       System.out.println(sb.toString());
   }
}