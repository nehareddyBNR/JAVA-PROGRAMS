//Program to display the first 10 natural numbers.
public class NaturalNumbers {
    public static void main(String[] args) {
        
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nUsing while loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n\nUsing do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
    }
}
