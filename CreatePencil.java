import java.io.*;
class Pencil
{
   public String colour;
   public void setColour(String newColour)
   {
      colour=newColour;
   }
}
public class CreatePencil
{
   public static void main(String args[])
   {
      Pencil p1=new Pencil();
      p1.setColour("blue");
      System.out.println(p1.colour);
   }
}