/*10. Program in Java to display the pattern like right angle triangle with a number. 
Input number of rows : 5 
Expected Output : 
1 
12 
123 
1234 
12345*/

import java.util.Scanner;
public class NumberTriangle
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows: ");
      int rows = sc.nextInt();
    
      System.out.println("Right angle triangle pattern:");
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
               System.out.print(j);
            }System.out.println();
        } 
     }
}