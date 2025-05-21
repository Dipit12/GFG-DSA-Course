package Recursion;

public class recursion1 {
    public static void main(String[] args){
        func(3);
    }
    public static void func(int n){
        if(n == 0){
            return;
        }
        System.out.println("GFG");
        func(n-1);
    }
}
