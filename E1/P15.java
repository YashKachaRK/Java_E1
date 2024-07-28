public class P15 {
    public static void main(String[] args) {
//        Write a program to find the factorial of a number using recursive.
        int i , fac = 1;
        int a = 5;
        if (a==1||a==0) {
            System.err.println("1");
        }else{
            for(i = 1 ; i <=a; i++){
                fac = fac * i ;
            }
            System.out.println(fac);
        }

    }
}
