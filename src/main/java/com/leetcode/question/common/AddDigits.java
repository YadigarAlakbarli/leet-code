package com.leetcode.question.common;

public class AddDigits {
    public static void main(String[] args) {

    }

    public static int addDigits(int num) {
        int remain = num % 9;
        if (remain == 0) {
            if (num > 0) {
                return 9;
            }
            return 0;
        }
        return remain;
    }

}
