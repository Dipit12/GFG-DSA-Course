import java.util.ArrayList;
import java.util.Collections;
// leetcode

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        // iterate the arr and for each number check its digit, if it's even the increase the count buy 1
        for(int i = 0; i < nums.length;i++){

            int digit = checkDigit(nums[i]);
            if(digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
    static int checkDigit(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
}
