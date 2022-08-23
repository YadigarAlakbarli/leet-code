package com.leetcode.question.array;

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] nums = {-5, -3, -2, -1, 4, 7, 9};
        System.err.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int lastIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[0]) > Math.abs(nums[lastIndex - i])) {
                int dummy = nums[lastIndex - i];
                nums[lastIndex - i] = nums[0] * nums[0];
                for (int j = 0; j < nums.length - i; j++) {
                    if (Math.abs(dummy) < Math.abs(nums[j])) {
                        nums[0] = dummy;
                    } else {

                    }
                }
            } else {
                nums[lastIndex - i] = nums[lastIndex - i] * nums[lastIndex - i];
            }
        }
        return nums;
    }

}
