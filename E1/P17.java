public class P17 {
    public static void main(String[] args) {
        //Write a program to find the largest number in an array.

        int list[] = {12,321,213,1231,32};

        int big = list[0];

        for(int i=1 ; i<list.length; i++){
            if(list[i]>big){
                big=list[i];
            }
        }
        System.out.println("Large number of array is: "+big);
    }
}
