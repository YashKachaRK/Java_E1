//3 Write a program to convert the temperature in Centigrade to Fahrenheit.


import java.util.Scanner;;
public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me Centigrade: ");
        double c= scanner.nextInt();
        double ans;
        ans = (c*9/5) +32;
        System.out.println("Fahrenheit is: "+ans);

    }
}
