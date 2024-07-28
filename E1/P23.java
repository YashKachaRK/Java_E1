import java.util.Scanner;
import java.math.*;
// Write a program to Calculate the Body mass Index (BMI).

// The user enters his height (in inches) and weight (in pounds). The variables passed by the user are assigned to the float type. After calculating the BMI value, the value will be assigned to the appropriate range and the correct message will appear on the console. You can use the if-else-if ladder for printing the message on the console. (HINT FOR CALCULATION: bmi = (float)(weight / Math.pow(height, 2) * 703)

       

// Intervals of BMI index:

// 16.00 or less = starvation
// 16.00-16.99 = emaciation
// 17.00-18.49 = underweight
// 18.50-22.99 = normal, low range
// 23.00-24.99 = normal high range
// 25.00-27.49 = overweight low range
// 27.50-29.99 = overweight high range
// 30.00-34.99 = 1st degree obesity
// 35.00-39.99 = 2nd degree obesity
// 40.00 or above = 3rd degree obesity
public class P23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Height: ");
        float height = Float.parseFloat(s.nextLine());
        System.out.print("Enter Weight: ");
        float weight  =Float.parseFloat(s.nextLine());
        double pounds = weight * 2.20462;
        float inch = height * 12;

        float bmi = (float) (pounds/Math.pow(inch, 2)*703);

        System.out.println(bmi);

        if (bmi <= 16.00) {
            System.out.println("starvation");
        } else if (bmi <=16.99) {
            System.out.println("emaciation");
        } else if (bmi <=18.49){
            System.out.println("underweight");
        }else if(bmi<=22.99 ){
            System.out.println("normal, low range");

        }else if(bmi<= 24.99 ){
            System.out.println("normal high range");

        }else if(bmi<= 27.49 ){
            System.out.println("overweight low range");

        }else if(bmi<=29.99 ){
            System.out.println("overweight high range");

        }else if(bmi<= 34.99 ){
            System.out.println(" 1st degree obesity");

        }else if(bmi<=39.99 ){
            System.out.println("2nd degree obesity");

        }else{
            System.out.println("3rd degree obesity");
        }
    }
}
