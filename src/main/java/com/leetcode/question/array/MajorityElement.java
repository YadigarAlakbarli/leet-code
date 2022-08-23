package com.leetcode.question.array;

import java.util.HashSet;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {6, 5, 5};
        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] nums) {
        int length = nums.length;
        int halfLenght = length / 2 + 1;
        HashSet<Integer> searched = new HashSet<>();

        for (int j = 0; j < halfLenght; j++) {
            if (searched.contains(nums[j])) {
                continue;
            }
            int count = 0;
            for (int i = 1; i < length; i++) {
                if ((count + (length - j) < halfLenght)) {
                    break;
                }
                if (nums[j] == nums[i]) {
                    count++;
                    if (count >= halfLenght) {
                        return nums[j];
                    }
                    searched.add(nums[j]);
                }
            }
        }
        return nums[0];
    }

}
