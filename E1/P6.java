//Write a program to calculate the area of a rectangle.

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me length: ");
        double length=Double.parseDouble(scanner.nextLine());
        System.out.print("Give me width: ");
        double width=Double.parseDouble(scanner.nextLine());
        double area = length*width;
        System.out.println("Area is: "+area);
    }
}
