package ArrayAndArrayList;

import java.util.Scanner;

public class isArraySorted {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int[] arr) {
        // brute force - O(n^2)
        for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;

    }

    // efficient way to solve this in linear time complexity
    static boolean efficientIsSorted(int[] arr){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
