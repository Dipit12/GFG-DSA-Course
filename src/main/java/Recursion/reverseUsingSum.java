package Recursion;

public class reverseUsingSum {
    public static void main(String[] args) {

    }
    static int sum = 0;
    static void sum(int n){
        if(n==0){
            return;
        }
        int rem = n %10;
        sum = sum * 10 + rem;
        sum(n/10);

    }
}
