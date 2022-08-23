package com.leetcode.question.common;

public class StudentAttendanceRecordI {

    public static void main(String[] args) {
        System.out.println(checkRecord("LPPALLP"));
    }

    public static boolean checkRecord(String s) {
        int l = 0;
        int a = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                if (a == 1) {
                    return false;
                }
                a++;
                l = 0;
            } else if (c == 'L') {
                if (l == 2) {
                    return false;
                }
                l++;
            } else {
                l = 0;
            }
        }
        return true;
    }

}
