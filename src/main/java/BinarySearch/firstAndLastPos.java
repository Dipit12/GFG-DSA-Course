package BinarySearch;

public class firstAndLastPos {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;

            if (nums.length == 0) {
                return new int[]{-1, -1};
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] > target) {
                    end = mid - 1;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    // we have found the middle element here
                    int left = mid;
                    int right = mid;

                    while (left > 0 && nums[left - 1] == target) {
                        left--;
                    }
                    while (right < nums.length - 1 && nums[right + 1] == target) {
                        right++;
                    }

                    return new int[]{left, right};
                }
            }

            return new int[]{-1, -1};
        }
    }

}
