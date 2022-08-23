package com.leetcode.question.common;

public class LongestPalindrome {

    public static void main(String[] args) {

        int i = ('a' ^ 'b') ^ ('a' ^ 'b');


        long start = System.nanoTime();
        System.out.println(longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"));
        System.out.println(System.nanoTime() - start);  //796834


    }


    public static int longestPalindrome(String s) {
        int[] charIndxes = new int[58];
        int count = 0;

        for (Character c : s.toCharArray()) {
            if (charIndxes[c -65] % 2 == 1) {
                count += 2;
            }
            charIndxes[c-65]++;
        }

        if (s.length() - count > 0) {
           count++;
        }
        return count;
    }

}
