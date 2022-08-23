package com.leetcode.question.common;

public class HammingDistance {

    public static void main(String[] args) {
        System.err.println(hammingDistance(1, 3));
    }


    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }


}
