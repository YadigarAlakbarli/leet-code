package com.leetcode.question.triangle;

import java.util.List;

public class MinimumPath {

    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(
                List.of(1),
                List.of(2, 3),
                List.of(1, -1, -3),
                List.of(0, 0, 0, 0));

        System.err.println(minPath(triangle));
    }

    // FIXME: 13.06.22 
    private static int minPath(List<List<Integer>> triangle) {
        int currIndex = 0;
        int minPath = triangle.get(currIndex).get(currIndex);
        if (triangle.size() == 1) {
            return minPath;
        }
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> currentRow = triangle.get(i);
            if (currentRow.get(currIndex) < currentRow.get(currIndex + 1)) {
                minPath += currentRow.get(currIndex);
            } else {
                minPath += currentRow.get(currIndex + 1);
                currIndex += 1;

            }
        }
        return minPath;
    }

}
