package ArrayAndArrayList;

import java.util.Scanner;

public class maxElementInArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(maxOfArr(arr));

    }
    static int maxOfArr(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
