//Java Program to read a number from the user and print whether it is positive or negative.
import java.util.Scanner;
public class Check 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int num = sc.nextInt();

      //logic
      if (num>0)
      { 
        System.out.println("The number is positive!!");
      }
      else if (num < 0)
      {
        System.out.println("The number is Negative!!");
      }
      else 
      {
        System.out.println("The number is Zero!!");
      }
   }
}