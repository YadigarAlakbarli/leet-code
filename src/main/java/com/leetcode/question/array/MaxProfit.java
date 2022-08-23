package com.leetcode.question.array;

public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 6, 6, 4, 9};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        int max = length - 1;
        int profit = 0;

        for (int i = length - 1; i >= 0; i--) {
            if (prices[max] < prices[i]) {
                max = i;
            }
            if ((prices[max] - prices[i] > profit) && i < max) {
                profit = prices[max] - prices[i];
            }
        }
        return profit;
    }

}
