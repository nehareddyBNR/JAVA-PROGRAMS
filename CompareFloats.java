//Java Program that reads in two floating-point numbers and tests whether they are the same up  
//to three decimal places.

import java.util.Scanner;
public class CompareFloats
{
   public static void main(String[] args)
   { 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first number: ");
      double n1 = sc.nextDouble();
      System.out.println("Enter the Second number: ");
      double n2 = sc.nextDouble();
   
      int num1 = (int)(n1 * 1000);
      int num2 = (int)(n2 * 1000);
  
     if (num1 == num2)
        System.out.println("The numbers are same upto the 3 decimal places.");
     else
        System.out.println("The numbers are different.");
   }
}
     