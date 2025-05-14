package Maths;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args){
        // a prime number has only 2 factors - 1 and the number itself
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 1){
            System.out.println("Not prime");
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}
