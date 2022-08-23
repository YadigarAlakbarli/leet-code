package com.leetcode.question.common;

import com.leetcode.question.model.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {

    public static void main(String[] args) {

    }

    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode currentNode = head;

        while (currentNode != null) {
            if (nodeSet.add(currentNode)) {
                currentNode = currentNode.next;
            } else {
                return currentNode;
            }
        }
        return null;
    }
}
