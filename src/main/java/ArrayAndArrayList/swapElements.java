package ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class swapElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,45,6};
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        swap(arr,index1,index2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        // swapping could either be done using temp var or using bit-wise operator
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;

        arr[index1] = arr[index1] ^ arr[index2];
        arr[index2] = arr[index1] ^ arr[index2];
        arr[index1] = arr[index1] ^ arr[index2];
    }
}
