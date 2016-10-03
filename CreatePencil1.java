import java.io.*;
class Pencil
{
   public String colour;
   public Pencil()
   {
   }
   public Pencil(String newColour)
   {
      colour=newColour;
   }
}
public class CreatePencil1
{
   public static void main(String args[])
   {
      Pencil p1=new Pencil("blue");
      System.out.println(p1.colour);
   }
}