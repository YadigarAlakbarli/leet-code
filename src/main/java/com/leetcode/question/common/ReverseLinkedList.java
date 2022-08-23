package com.leetcode.question.common;

import com.leetcode.question.model.ListNode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(1);
        ListNode listNode3 = new ListNode(2, listNode4);
        ListNode listNode2 = new ListNode(3, listNode3);
        ListNode listNode = new ListNode(4, listNode2);

        printNode(reverseList(listNode));
    }


    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    public static void printNode(ListNode node) {
        System.err.println("****************************");
        ListNode next = node;
        while (next != null) {
            System.err.println(next.val);
            next = next.next;
        }
    }

}
