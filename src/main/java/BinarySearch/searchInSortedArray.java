package BinarySearch;

public class searchInSortedArray {
    // first find the pivot element
    //  nums = [4,5,6,7,0,1,2], target = 0
    public static void main(String[] args) {
        // finding the pivot element
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
       int pivot = findElement(nums);
        int x =(binarySearch(nums,target,0,pivot));
       int y =  (binarySearch(nums,target,pivot+1,nums.length-1));
       if(x > 0){
           System.out.println(x);
       }else{
           System.out.println(y);
       }
    }

    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findElement(int[] nums){
        int end = nums.length-1;
        for(int i = 0; i <= nums.length;i++){
            if( i < end && nums[i] > nums[i+1]){
                return i;
            }
        }
        return -1;
    }

}
