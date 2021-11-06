package com.lts.main;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if (i!=nums[i]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
