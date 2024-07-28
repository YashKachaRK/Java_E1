public class P14 {
    public static void main(String[] args) {
        // Write a program to check whether the given number is prime or not.

        int number = 27 , m= 0,flag=0;
        m =number/2;

        if (number==0||number==1){
            System.out.println("Not Prime");
        }else{
            for (int i =2; i<=m;i++){
                if (number%i==0) {
                    System.out.println("Not Prime");
                    flag=1;
                    break;
                }
            }
            if (flag==0) {
                System.out.println("Prime");
            }
        }
        
    }
}
