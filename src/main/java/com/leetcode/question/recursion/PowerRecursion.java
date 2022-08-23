package com.leetcode.question.recursion;

public class PowerRecursion {

    public static void main(String[] args) {
        System.err.println(power(5));
    }

    // x= 5 // return 2^5
    public static int power(int x) {
        if (x == 0) {
            return 1;
        } else {
            x--;
            return 2 * power(x);
        }
    }

}
