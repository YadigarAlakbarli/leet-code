package com.leetcode.question.pattern;

import java.util.HashMap;
import java.util.Objects;
import java.util.TreeSet;

public class WordPattern {

    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        long start = System.nanoTime();
        System.out.println(pattern(pattern, s));
        System.err.println(System.nanoTime() - start);
    }

    public static boolean pattern(String pattern, String s) {

        String[] chars = pattern.split("");
        String[] strs = s.split(" ");
        if (strs.length != chars.length) {
            return false;
        } else if (strs.length == 1) {
            return true;
        }
        HashMap<String, String> pairs = new HashMap<>();
        TreeSet<String> reservedVal = new TreeSet<>();
        for (int i = 0; i < chars.length; i++) {
            String v = pairs.get(chars[i]);
            if (Objects.nonNull(v)) {
                if (!v.equals(strs[i])) {
                    return false;
                }
            } else {
                if (reservedVal.contains(strs[i])) {
                    return false;
                }
                reservedVal.add(strs[i]);
                pairs.put(chars[i], strs[i]);
            }
        }
        return true;
    }

}
