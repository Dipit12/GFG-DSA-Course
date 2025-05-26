package SortingAlgo;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSorting(int[] arr){
        for(int i =0; i < arr.length;i++){
            // find the max item in the remaining arr and swap it with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0,last);
            // swap maxIndex with the element at last index
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int maxIndex = start;
        for(int i = start + 1; i <= end; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    }





















