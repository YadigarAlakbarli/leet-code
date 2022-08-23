package com.leetcode.question.search;

public class BinarySearch {
    // int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 0 --- 9 --- 4

        System.err.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {

        int left;
        int right = nums.length - 1;
        int pointer = right;
        while (true) {
            if (nums[right] > target + 1) {
                pointer = right;
                right = right / 2;     //10    5
            } else {
                left = right;
                right = pointer;
                break;
            }
        }

        for (int i = left; i < right; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
