package com.leetcode.question.array;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.err.println(Arrays.toString(arr));

    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - count] = nums[i];
            } else {
                count++;
            }
        }
        while (count > 0) {
            nums[nums.length - count--] = 0;
        }
    }


}
