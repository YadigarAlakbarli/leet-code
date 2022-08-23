package com.leetcode.question.common;

import com.leetcode.question.model.ListNode;

public class MiddleOfTheLinkedList {


    public static void main(String[] args) {

        ListNode listNode8 = new ListNode(8);
        ListNode listNode7 = new ListNode(7, listNode8);
        ListNode listNode6 = new ListNode(6, listNode7);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode = new ListNode(1, listNode2);

        System.out.println(middleNode(listNode).val);
    }


    public static ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        ListNode midNodeNext = head.next;
        ListNode currentNode = head;
        int count = 0;

        while (currentNode != null) {
            count++;
            if (count % 2 == 0) {
                middleNode = midNodeNext;
                midNodeNext = midNodeNext.next;
            }
            currentNode = currentNode.next;
        }
        return middleNode;
    }


}
