// leetcode

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maximumWealth(int[][] accounts) {
        // store total wealth of an customer in a 1D arr and return the max of it
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < accounts.length;i++){
            int sum = 0;
            for(int j = 0; j < accounts[i].length;j++){
                sum += accounts[i][j];
            }
            list.add(sum);
        }
        return Collections.max(list);
    }
}