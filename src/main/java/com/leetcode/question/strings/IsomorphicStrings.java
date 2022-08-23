package com.leetcode.question.strings;

import java.util.HashMap;
import java.util.Objects;
import java.util.TreeSet;

public class IsomorphicStrings {

    public static void main(String[] args) {

    }

    public static boolean isIsomorphic(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        } else if (t.length() == 1) {
            return true;
        }
        HashMap<Character, Character> pairs = new HashMap<>();
        TreeSet<Character> reservedVal = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character v = pairs.get(s.charAt(i));
            if (Objects.nonNull(v)) {
                if (!v.equals(t.charAt(i))) {
                    return false;
                }
            } else {
                if (reservedVal.contains(t.charAt(i))) {
                    return false;
                }
                reservedVal.add(t.charAt(i));
                pairs.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

}
