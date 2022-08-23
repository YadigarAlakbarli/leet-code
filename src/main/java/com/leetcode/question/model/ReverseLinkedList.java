package com.leetcode.question.model;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode = new ListNode(1, listNode2);

        System.err.println("------------------");
        printNode(listNode);
        ListNode reveredNode = reverseList(listNode);
        System.err.println("********************");
        printNode(reveredNode);
        System.err.println("********************");

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode riteHead = new ListNode(head.val);
        ListNode rightNode = head.next;
        ListNode listNode;
        while (rightNode != null) {
            listNode = new ListNode(rightNode.val, riteHead);
            riteHead = listNode;
            rightNode = rightNode.next;
        }
        return riteHead;
    }

    public static void printNode(ListNode node) {
        ListNode next = node;
        while (next != null) {
            System.err.println(next.val);
            next = next.next;
        }

    }


}
