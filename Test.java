import java.io.*;
class SuperShow
{
   public String str="superstr";
   public void show()
   {
      System.out.println("super show:="+str);
   }
}
class ExtendShow extends SuperShow
{
   public String str="extendedstr";
   public void show()
   {
       System.out.println("extended show:="+str);
   }
}
class Test
{
   public static void main(String args[])
   {
      ExtendShow ext=new ExtendShow();
      SuperShow sup=ext;
      sup.show();
      ext.show();
   }
}