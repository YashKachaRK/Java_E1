//Write a program to calculate the area of Circle.
import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me Radius: ");
        double c= scanner.nextInt();
        double ans;
        ans = 3.14*c*c;
        System.out.println("Ans is: "+ans);
    }
}
