package com.leetcode.question.game;

class NimGame {

    public static void main(String[] args) {
        System.err.println(canWinNim(3));
    }

    protected static boolean canWinNim(int n) {
        return n % 4 != 0;
    }

}



