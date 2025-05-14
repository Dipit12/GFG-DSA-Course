package Maths;

import java.util.Scanner;

public class GCD_OF_2_NUM {
    public static int GCD(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int min = Math.min(a,b);
        while(min > 0){
            if(a % min == 0 && b % min == 0){
                break;
            }
            min--;
        }
       return min;
    }
    public static void main(String[] args){
        System.out.println(GCD());
    }
}
