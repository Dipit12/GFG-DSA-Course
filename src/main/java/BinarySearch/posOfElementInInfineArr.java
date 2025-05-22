package BinarySearch;

public class posOfElementInInfineArr {
    // in this question basically we cant use arr.length function since the size of the arr is infinite
    // what we can do is - take start and end pointer of a chunk and search if target exists btw them if it exists then apply BS otherwise move the pointers and double the chunk size
    static int binarySearch(int[] arr, int target, int start, int end) {

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
        return -1;
    }
    static int ans(int[] arr, int target){
        // first find the range
        // start with chunk of 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in rnage
       while(target > arr[end]){
           int newStart = end + 1;
           end  = end + 2*(end-start+1);
           start = newStart;
       }
       return binarySearch(arr,target,start,end);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,90,345,21133};
        int target = 6;
        System.out.println(ans(arr,target));

    }
}
