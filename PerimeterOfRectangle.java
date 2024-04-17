// import java.util.Scanner;
// public class PerimeterOfRectangle{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("The Perimeter of Rectangle is:");

//         System.out.println("Enter the length:");
//         double length = scanner.nextDouble();

//         System.out.println("Enter the breath");
//         double breath = scanner.nextDouble();

//         double Perimeter = 2*(length+ breath);
//         System.out.println("The area of the wall is:" + Perimeter);
//         scanner.close();
//     }
// }
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The Perimeter of Rectangle is:");

        System.out.println("Enter the length:");
        double length = scanner.nextDouble();

        System.out.println("Enter the breadth:");
        double breadth = scanner.nextDouble();

        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        
        scanner.close();
    }
}
