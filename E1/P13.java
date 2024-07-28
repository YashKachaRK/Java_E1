import java.util.ArrayList;
import java.util.List;

public class P13 {
    public static void main(String[] args) {
        //Write a Program to Display all the multiples of 3 within the range of 10 to 50.
        int number = 3;
        List<Integer> list = new ArrayList<>();
        List<Integer> Ans = new ArrayList<>();

        for (int i=1; i<20;i++){
           int check = number*i;
           list.add(check);
        }

        for(int j : list){
            for (int k = 10; k<51; k++){
                if (k==j) {
                    Ans.add(k);
                }
            }
        }
        System.out.println("Display Number: "+Ans);
    }
}
