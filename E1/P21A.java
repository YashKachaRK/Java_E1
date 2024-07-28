public class P21A {
    static int a=0,b=1,c;
    public static void main(String[] args) {
        
        // with recursion
        int n =5;
        P21A ob = new P21A();
        ob.f_r(n);
    }
    void f_r(int n){
        if(n>=1){
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
            f_r(n-1);
        }
    }
}
