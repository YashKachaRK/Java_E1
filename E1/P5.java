//Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me Base: ");
        double base=Double.parseDouble(scanner.nextLine());
        System.out.print("Give me Height: ");
        double height=Double.parseDouble(scanner.nextLine());
        double area = (base*height)/2;
        System.out.println("Area is: "+area);
    }
}
