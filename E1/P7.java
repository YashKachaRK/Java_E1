import java.util.Scanner;

public class P7 {
    //Write a program to calculate the area of a square.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me area: ");
        double area=Double.parseDouble(scanner.nextLine());
        double ans =  area * area;
        System.out.println("Area is: "+ans);
    }
}
