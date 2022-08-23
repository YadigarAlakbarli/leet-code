package com.leetcode.question.bfs;

import java.util.Objects;

public class SameTree {

    //cpd development))
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (Objects.isNull(p) || Objects.isNull(q)) return p == q;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}

