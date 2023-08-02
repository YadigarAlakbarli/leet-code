package com.leetcode.question.graph;

public class InvertBinaryTree {

    public static void main(String[] args) {

    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = right;
        root.right = left;

        invertTree(left);
        invertTree(right);

        return root;
    }

}
