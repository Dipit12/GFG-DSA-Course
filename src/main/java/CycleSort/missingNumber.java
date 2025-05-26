package CycleSort;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correctIndex = nums[i];
            if( nums[i] < n && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        for(int j = 0; j <n; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}