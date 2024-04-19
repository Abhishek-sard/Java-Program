import java.util.Scanner;
public class Perimeter{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("The Perimeter of an Angle is:");

        System.out.println("Enter the Length:");
        double Length= S. nextDouble();

        System.out.println("Enter the breadth");
        double breadth = S.nextDouble();

        System.out.println("Enter the Height:");
        double Height = S.nextDouble();

        double perimeter = Length*breadth*Height;
        System.out.println("The perimeter of trainngle is:" + perimeter);
        S.close();
    }
}