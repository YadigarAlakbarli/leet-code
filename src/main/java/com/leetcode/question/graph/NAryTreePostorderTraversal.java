package com.leetcode.question.graph;

import com.leetcode.question.model.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NAryTreePostorderTraversal {

    boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Integer> postorder(Node root) {
        List<Integer> postorderValues = new ArrayList<>();
        if (root == null) return postorderValues;

        Stack<Node> stack = new Stack<>();
        stack.add(root);


        while (!stack.isEmpty()) {
            root = stack.pop();
            postorderValues.add(0, root.val);
            stack.addAll(root.children);
        }
        return postorderValues;
    }


}
