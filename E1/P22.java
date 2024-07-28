import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        //Demonstrate the usage of Switch ... .Case and implement a calculator to do basic operations.

        int a = 10;
        int b = 21;

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter Oparaters such as: + , - , * , / : ");
        char op = Scanner.next().charAt(0);

        double result = 0;

        switch (op) {
            case '+':
                result = a+b;
                break;
            
            case '-':
                result =a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                if (b!=0) {
                    result=a/b;
                }else{
                    System.out.println("Error: Cannot divide by zero");

                }
                break;
            default:
                System.out.println("Error: Invalid Operation");
        }
        System.out.println(a+" "+op+" "+b+" = "+result);


    }
}
