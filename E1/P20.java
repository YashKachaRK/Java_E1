public class P20 {
    public static void main(String[] args) {
        //Write a program to check whether a given year is a leap year or not.


        int year = 2000;

        if (year%4==0) {
            System.out.println(year+" This year is leap year");
        }
        else{
            System.out.println(year+" This Year is Not leap year");
        }
    }
}
