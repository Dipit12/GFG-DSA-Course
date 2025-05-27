package RecursionIntro;

import java.util.Scanner;

public class fiboNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fiboNum(n));

    }

    static int  fiboNum(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fiboNum(num-1) + fiboNum(num-2);
    }
}
