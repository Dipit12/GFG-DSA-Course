package Recursion;

public class productOfDigit {
    public static void main(String[] args) {
        System.out.println(product(123));
    }
    static int product(int n){
        if(n == 1){
            return 1;
        }
        return (n%10) * product(n / 10);
    }
}
