package SortingAlgo;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        for(int i = 0; i < arr.length;i++){
            for(int j = i +1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    // swap these nums
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
