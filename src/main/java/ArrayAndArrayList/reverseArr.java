package ArrayAndArrayList;

import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length -1 ;
        while(end >= start){
            swap(arr,start, end);
            start++;
            end--;
        }
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
