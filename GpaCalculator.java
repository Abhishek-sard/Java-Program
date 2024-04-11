import java.util.Scanner;
public class GpaCalculator{
    public static void main(String[] args) {
        float a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Mark:");
        a=s.nextFloat();
        b = a /500*100;
        c = b / 25;
        System.out.println(c);
    }
}