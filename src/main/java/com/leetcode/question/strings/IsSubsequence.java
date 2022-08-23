package com.leetcode.question.strings;

public class IsSubsequence {

    public static void main(String[] args) {
        //s = "abcj", t = "ahbgdc"
        String s = "";
        String t = "dhabgdc";

        System.out.println(isSubsequence(s, t));
    }


    public static boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }

        int cur=0;

        for(int i=0; i<t.length() && cur<s.length(); i++){
            char a = s.charAt(cur);
            char b = t.charAt(i);
            if(a==b){
                cur++;//find next char in s
            }
        }

        return cur==s.length();
    }


}
