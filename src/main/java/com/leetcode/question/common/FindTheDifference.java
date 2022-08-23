package com.leetcode.question.common;

public class FindTheDifference {

    public static void main(String[] args) {
        String s = "", t = "e";
        System.err.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int length = s.length();
        int diff = 0;
        for (int i = 0; i < length; i++) {
            diff ^= arr1[i] ^ arr2[i];
        }
        diff ^= arr2[length];
        return (char) diff;
    }


}
