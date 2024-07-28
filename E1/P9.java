import java.util.Scanner;

public class P9 {
    //Write a program to find out the average of a set of integers numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0,avg;
        
        System.out.print("How many numbers do you want to see the average of? ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i<n; i++){
            System.out.print("Enter Value: ");
            int value = Integer.parseInt(scanner.nextLine());

            sum=sum+value;
        }
        avg =sum/n;

        System.out.println("Average of "+sum+" is "+avg);
    }
}
