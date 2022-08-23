package com.leetcode.question.tree;

import com.leetcode.question.model.Node;

import java.util.List;

public class NAryTreePreorderTraversal {

    public static void main(String[] args) {
        int n = 136;
        System.out.println(Integer.toBinaryString(n));

        int x = n >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }


    public static List<Integer> preorder(Node root) {
        List<Node> childrens = root.children;

        return null;
    }

}
