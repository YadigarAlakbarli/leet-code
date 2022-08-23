package com.leetcode.question.array;

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((sum - nums[i] - sum2) == sum2) {
                return i;
            }
            sum2 += nums[i];
        }
        return -1;
    }

}
