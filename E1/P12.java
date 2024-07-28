public class P12 {
    public static void main(String[] args) {
        //Write a program to find the sum of the digits of an integer using a while loop.

        int number =123;
        int temp = number;
        int sum = 0;


        while (temp >0) {
            int digit =temp%10;
            sum += digit;
            temp/=10;
        }
        System.out.println(sum);
    }
}
