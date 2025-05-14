package Maths;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        if(n == 0 || n == 1){
            System.out.println(1);
        }
        while(n >= 1){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
