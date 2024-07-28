import java.util.Scanner;

public class P8 {
    //Write a program to check whether a given number is odd or even.
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = Integer.parseInt(scanner.nextLine());
        
        if (number%2==0) {
            System.out.println("This number "+number+" is Even");
        }else{
            System.out.println("This number "+number+" is Odd");
        }
    }
}
