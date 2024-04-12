
import java.util.Scanner;
public class Muntiple {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Numbers:");
        num = s.nextInt();
        for(int i = 1; i <=10; ++i){
            System.out.printf("%d *%d = %d \n",num,i,num *i);
        }
    }
}
