package com.leetcode.question.common;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.err.println(factorial(4));
    }

    public static int factorial(int n) {  //5
        if (n == 1) return 1;
        return n * factorial(n - 1); // 5 * 4 * 3 * 2 * 1
    }

}
