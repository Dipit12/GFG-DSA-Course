package BinarySearch;

public class orderAgnosticBS {
    // here we dont know whether the arr is sorted in ascending or descending order
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,4,3,2,1};

        System.out.println(orderAgnosticBS(arr1,5));
        System.out.println(orderAgnosticBS(arr2,5));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted is asc or descending
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start <= end){
            int middle  = start + (end - start)/2;
            if(arr[middle] == target){
                return middle;
            }

            if(isAsc){
                if(target > arr[middle]){
                    start = middle + 1;
                }else if(target < arr[middle]){
                    end = middle - 1;
                }
            }else{
                if(target > arr[middle]){
                    end = middle - 1;
                }else if(target < arr[middle]){
                    start = middle + 1;
                }
            }


        }
        return -1;
    }
}
