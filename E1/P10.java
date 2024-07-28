public class P10 {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.0, 3.5, 4.0};

        double product = 1.0;

        // for (double num : numbers) {
        //     product *= num;
        // }
        for (double num : numbers){
            product *= num;
        }

        // Print the result
        System.out.println("The product of the real numbers is: " + product);
    }
}
