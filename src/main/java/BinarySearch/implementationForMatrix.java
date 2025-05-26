package BinarySearch;

import java.util.Arrays;

public class implementationForMatrix {
    public static int[] binarySearch() {
        int[][] arr = {
                {10, 20, 30, 40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
      int target = 37;
      int start = 0;
      int end = arr.length - 1;

      while(start < arr.length && end >= 0){
          if(arr[start][end] == target){
              return new int[] {start,end};
          }
          else if(arr[start][end] < target){
              start++;
          }
          else{
              end--;
          }
      }
      return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(binarySearch()));
    }
}
