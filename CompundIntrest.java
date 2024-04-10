//write a program to find the compund Intrest;
import java.util.Scanner;
public class CompundIntrest{
    public static void main(String[]args){
        double a, p, t, r, ci, b, c;
        System.out.println("Enter Principle:");
        System.out.println("Enter time:");
        System.out.println("Enter rate:");
        Scanner s = new  Scanner(System.in);
        p=s.nextDouble();
        t=s.nextDouble();
        r=s.nextDouble();
        b=(1+(r/100));
        c=Math.pow(b,2);
        a=p*c;
        ci=a-p;
        System.out.println("The compund rate is:"+ci);




    }
}