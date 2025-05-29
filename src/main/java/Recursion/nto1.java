package Recursion;

import java.util.Scanner;

public class nto1 {
    public static void main(String[] args) {
        // write a recursive code to print numbers from n to 1
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       print(n);
    }
    static void print(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
