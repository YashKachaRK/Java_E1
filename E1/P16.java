import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        //Write a program to display the sum of n numbers using an array.

        // add n number in array
        Scanner scanner = new Scanner(System.in);

        System.out.print("How Many Number You can Add array: ");
        int number = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        int a =1;

        for (int i =0; i <number; i++){
            System.out.print("Enter value "+a+": ");
            int v = Integer.parseInt(scanner.nextLine());
            list.add(v);
            a=a+1;
        }

        int sum =0;
        for(int i : list){
            sum = sum+i;
        }

        System.out.println("\nsum of Array: "+sum);
    }
}
