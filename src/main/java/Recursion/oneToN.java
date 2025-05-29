package Recursion;

import java.util.Scanner;

public class oneToN {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        print(n);
    }
    static void print(int n){
        if(n == 0){
            return;
        }

        print(n-1);
        System.out.println(n);
    }
}
