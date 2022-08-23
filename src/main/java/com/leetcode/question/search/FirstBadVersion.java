package com.leetcode.question.search;

public class FirstBadVersion extends VersionControl {

    public static void main(String[] args) {
        System.err.println(firstBadVersion(100));
    }


    public static int firstBadVersion(int n) {
        int left = 1;
        while (left <= n) {
            int mid = left + (n - left) / 2;
            if (isBadVersion(mid)) {
                n = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}

class VersionControl {
    static boolean isBadVersion(int version) {
        if (version > 22) {
            return true;
        }
        return false;
    }
}