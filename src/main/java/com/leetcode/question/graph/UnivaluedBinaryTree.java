package com.leetcode.question.graph;

import java.util.LinkedList;
import java.util.Queue;

public class UnivaluedBinaryTree {


    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            TreeNode right = node.right;
            int currentVal = node.val;

            if (right != null) {
                if (right.val != currentVal) {
                    return false;
                }
                queue.add(right);
            }

            if (left != null) {
                if (left.val != currentVal) {
                    return false;
                }
                queue.add(left);
            }
        }
        return true;
    }

}
