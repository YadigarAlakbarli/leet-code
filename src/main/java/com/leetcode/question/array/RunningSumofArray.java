package com.leetcode.question.array;

public class RunningSumofArray {

    public static void main(String[] args) {


    }

    public static int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
          sumArr[i] = sum +nums[i];
          sum+=nums[i];
        }
        return sumArr;
    }

}
