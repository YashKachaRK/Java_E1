public class P18 {
    public static void main(String[] args) {
        String word = "madam" , reverse ="";

        for (int i = word.length()-1 ; i>=0;i--){
            reverse+= word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }
    }
}
