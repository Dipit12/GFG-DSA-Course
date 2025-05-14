package Maths;

import java.util.Scanner;

public class primeFactors {
    public static boolean isPrime(int n){
        // a prime number has only 2 factors - 1 and the number itself

        if(n == 1){
            return true;
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
           return true;
        }else{
           return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                int x = i;
                while(n % x == 0){
                    System.out.println(i);
                    x *= i;
                }
            }
        }
    }
}
