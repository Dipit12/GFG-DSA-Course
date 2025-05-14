package Maths;

import java.util.Scanner;

public class countDigits {
    public static int countDigits(int n){
        // turn a negative number positive
        if(n < 0){
            n *= -1;
        }
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countDigits(n));
    }
}
