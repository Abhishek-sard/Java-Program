import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate the factorial
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }
        scanner.close();
    }
}
