package com.leetcode.question.graph;

public class MaximumDepthOfBinaryTree {

    int max = 0;

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        recursive(root, max);
        return max;
    }

    public int recursive(TreeNode root, int count) {
        if (root == null) {
            max = Math.max(count, max);
            return count;
        }
        recursive(root.left, count + 1);
        recursive(root.right, count + 1);
        return count;
    }

}
