package com.leetcode.question.bfs;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class PrintTree {

    public static void main(String[] args) {
        TreeNode node = getTreeNode();

        printBFS(node);
        System.err.println("****************");
        printRFS(node);
    }

    public static void printBFS(TreeNode tree) {
        Queue<TreeNode> queue = new LinkedList<>();  //Stack<TreeNode> queue = new Stack<>();
        queue.add(tree);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.err.println(current);

            if (Objects.nonNull(current.left)) {
                queue.add(current.left);
            }
            if (Objects.nonNull(current.right)){
                queue.add(current.right);
            }
        }
    }


    public static void printRFS(TreeNode tree) {
        if (Objects.isNull(tree)) return;
        System.err.println(tree.val);
        printBFS(tree.left);
        printBFS(tree.right);
    }

    private static TreeNode getTreeNode() {
        TreeNode node = new TreeNode(000);

        TreeNode left1 = new TreeNode(1);
        node.left = left1;

        TreeNode right1 = new TreeNode(2);
        node.right = right1;

        TreeNode left2 = new TreeNode(3);
        left1.left = left2;

        TreeNode right2 = new TreeNode(4);
        right1.right = right2;

        TreeNode right3 = new TreeNode(5);
        right2.right = right3;

        TreeNode left3 = new TreeNode(6);
        right3.left = left3;

        TreeNode right4 = new TreeNode(7);
        right3.right = right4;
        return node;
    }

   static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

       @Override
       public String toString() {
           return "TreeNode{" +
                   "val=" + val +
                   '}';
       }
   }

}

