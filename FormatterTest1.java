import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Formatter;

public class FormatterTest1
{
      public static void main(String[] args) throws FileNotFoundException
      {
           Formatter form =new Formatter(new File("out.txt"));
           int num1=123;
           double num2=65.45;
           String str="Sravani";
           form.format("%s"+"\n"+"%d"+"\n"+"%.2f",str,num1,num2);
           form.close();
           System.out.println("The TextFile is Written");
      }
} 