import java.util.Scanner;
public class IT24100822Lab4Q1
{

   public static void main(String[] args)
   {

      Scanner input=new Scanner(System.in);
      float number;

      System.out.print("Enter a number");
      number=input.nextFloat();
      
      if (number>0)
      {  
          System.out.print("The number is:Positive");
      }

      else if (number==0)
      {
          System.out.print("The number is:zero");
      }

      else
      {
          System.out.print("The number is:Negative");
      }
      

   }
}