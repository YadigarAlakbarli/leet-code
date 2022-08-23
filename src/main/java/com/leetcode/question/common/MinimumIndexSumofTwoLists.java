package com.leetcode.question.common;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumIndexSumofTwoLists {

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        System.err.println(Arrays.toString(findRestaurant(list1, list2)));
    }


    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            Integer l1Indx = map.get(list2[j]);
            if (l1Indx != null) {
                int sum = l1Indx + j;
                if (sum < min) {
                    min = sum;
                    list1[0] = list2[j];
                    count = 1;
                } else if (sum == min) {
                    list1[count++] = list2[j];
                }
            }
        }

        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = list1[i];
        }
        return result;
    }


}
