//Take three numbers from the user and print the greatest number.
import java.util.Scanner;
public class Greatest
{
    public static void main(String[] args)
    {
        System.out.println("Enter any three integers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>b) && (a>c))
          System.out.println("The greatest number is "+a);
        else if((b>a) && (b>c))
          System.out.println("The greatest number is "+b);
        else
          System.out.println("The greatest number is "+c);
     }
}
    