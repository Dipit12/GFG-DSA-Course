package BinarySearch;

public class ceilOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,78,234};
        System.out.println(binarySearch(arr,2342));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(arr[end] < target){
            return -1;
        }

        while(start <= end){
            int middle  = start + (end - start)/2;

            if(target > arr[middle]){
                start = middle + 1;
            }else if(target < arr[middle]){
                end = middle - 1;
            }else{
                // ans found
                return middle;
            }

        }
        return start;
    }
}
