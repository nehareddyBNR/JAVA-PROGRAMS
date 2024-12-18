//9. Program in Java to display the multiplication table of a given integer. 

import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
   
       System.out.println("Enter any integer: ");
       int num = sc.nextInt();
     
       for(int i = 1 ; i<= 10; i++)
	System.out.println(num + "x" + i + "=" + (num*i));
     }
}


