import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        //Write a program to find the Nth term in a Fibonacci series using recursion and without recursion.

        int Fibonacci_a =0 , Fibonacci_b =1 , c ,term;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N number: ");
        term = scanner.nextInt();
        
        for(int i =1 ; i<=term ; i++){
            System.out.print(Fibonacci_a+ " ");
            c = Fibonacci_a+Fibonacci_b;
            Fibonacci_a = Fibonacci_b;
            Fibonacci_b  = c;
        }
    }
}
