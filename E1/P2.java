//Write a program to perform the following arithmetic operation. Take the input from the user.  addition ,subtraction ,multiplication and division. 
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoice 1: Addition");
            System.out.println("Choice 2: Subtraction");
            System.out.println("Choice 3: Multiplication");
            System.out.println("Choice 4: Division");
            System.out.println("Choice 5: Exit");
            System.out.print("Enter Choice: ");
            Integer choice = scanner.nextInt();
            if(choice.equals(1)){
                Addition();
            } else if (choice.equals(2)) {
                subtraction();
            }else if (choice.equals(3)) {
                multiplication();
            }else if (choice.equals(4)) {
                division();
            }else if (choice.equals(5)) {
                break;
            }else{
                System.out.println("Please enter valid choice");
            }
        }
       

    }

    public static void Addition (){
        System.out.println("\n-----Addition-----");
        Scanner a  = new Scanner(System.in);
        Scanner b  = new Scanner(System.in);
        System.out.print("\nEnter First Number: ");
        int first = a.nextInt();
        System.out.print("Enter Second Number: ");
        int second = b.nextInt();

        int c;
        c = first+second;
        System.out.println("Ans: "+c+"\n");
    }

    public static void subtraction(){
        System.out.println("\n-----Subtraction-----");

        Scanner a  = new Scanner(System.in);
        Scanner b  = new Scanner(System.in);
        System.out.print("\nEnter First Number: ");
        int first = a.nextInt();
        System.out.print("Enter Second Number: ");
        int second = b.nextInt();

        int c = first - second;
        System.out.println("Ans: "+c+"\n");
    }

    public static void multiplication(){
        System.out.println("\n-----Multiplication-----");

        Scanner a  = new Scanner(System.in);
        Scanner b  = new Scanner(System.in);
        System.out.print("\nEnter First Number: ");
        int first = a.nextInt();
        System.out.print("Enter Second Number: ");
        int second = b.nextInt();

        int c;
        c = first*second;
        System.out.println("Ans: "+c+"\n");
    }

    public static void division() {
        try{
            System.out.println("\n-----Divison-----");

            Scanner a  = new Scanner(System.in);
            Scanner b  = new Scanner(System.in);
            System.out.print("\nEnter First Number: ");
            int first = a.nextInt();
            System.out.print("Enter Second Number: ");
            int second = b.nextInt();

            int c;
            

        
        c = first/second;
        System.out.println("Ans: "+c+"\n");
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
