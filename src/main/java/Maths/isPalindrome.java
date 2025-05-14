package Maths;

import java.util.Scanner;

public class isPalindrome {
    public static boolean isPalindrome(int n){
        // compare the reversed number with the original number
        int revNum = 0;
        int temp = n;
        while(temp != 0){
            int digit = temp%10;
            revNum = revNum * 10 + digit;
            temp  = temp / 10;
        }
        if(revNum == n){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPalindrome(n));

    }
}
