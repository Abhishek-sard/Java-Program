import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rectangle Area Calculator");

        //prompt user for input
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        
        //calculate area
        double area = length*width;

        //display result
        System.out.println("The area of the rectangle is:" + area);
        scanner.close();
    }
}
