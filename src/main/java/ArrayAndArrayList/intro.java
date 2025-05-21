package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        // taking in input
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        // printing the arr
        for(int i =0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

        // another way to print
        for(int num : arr){
            System.out.println(num);
        }

        // another way to print arr
        System.out.println(Arrays.toString(arr));
    }
}
