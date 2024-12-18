//java Program to input 5 numbers from keyboard and find their sum and average.

import java.util.Scanner;
public class SumAverage
{   
   public static void main(String[] args)
   { 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num1: ");
      int num1 = sc.nextInt();
      System.out.println("Enter num2: ");
      int num2 = sc.nextInt();
      System.out.println("Enter num3: ");
      int num3 = sc.nextInt();
      System.out.println("Enter num4: ");
      int num4 = sc.nextInt();
      System.out.println("Enter num5: ");
      int num5 = sc.nextInt();

      int sum = (num1 + num2 + num3 + num4 + num5);
      int Average = ((num1 + num2 + num3 + num4 + num5))/5;

      System.out.println("The sum of given numbers is "+sum);
      System.out.println("The Average of given numbers is "+Average);

   }
}