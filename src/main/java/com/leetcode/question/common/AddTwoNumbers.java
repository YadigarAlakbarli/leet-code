package com.leetcode.question.common;

import com.leetcode.question.model.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {
/*        ListNode listNode10 = new ListNode(9);
        ListNode listNode9 = new ListNode(9, listNode10);
        ListNode listNode8 = new ListNode(9, listNode9);*/
        ListNode listNode7 = new ListNode(9);
        ListNode listNode6 = new ListNode(9, listNode7);
        ListNode listNode5 = new ListNode(9, listNode6);
        ListNode listNode4 = new ListNode(9, listNode5);
        ListNode listNode3 = new ListNode(9,listNode4);
        ListNode listNode2 = new ListNode(9, listNode3);
        ListNode listNode = new ListNode(9, listNode2);


        ListNode listNode24 = new ListNode(9);
        ListNode listNode23 = new ListNode(9, listNode24);
        ListNode listNode22 = new ListNode(9, listNode23);
        ListNode listNode1 = new ListNode(9, listNode22);
        ListNode listNode11 = addTwoNumbers(listNode, listNode1);
        printNode(listNode11);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remain = 0;
        ListNode l1Pointer = l1;
        ListNode l2Pointer = l2;
        ListNode newListNode = null;
        ListNode lastNode = null;
        while (l1Pointer != null || l2Pointer != null) {
            int sume = 0;
            if (l1Pointer != null) {
                sume = l1Pointer.val;
                l1Pointer = l1Pointer.next;
            }
            if (l2Pointer != null) {
                sume += l2Pointer.val;
                l2Pointer = l2Pointer.next;
            }
            sume += remain;
            if (sume < 10) {
                remain = 0;
            } else {
                if (sume > 10) {
                    sume -= 10;
                } else {
                    sume = 0;
                }
                remain = 1;
            }
            if (newListNode != null) {
                ListNode node = new ListNode(sume);
                lastNode.next = node;
                lastNode = node;
            } else {
                newListNode = new ListNode(sume);
                lastNode = newListNode;
            }
        }
        if (remain == 1) {
            lastNode.next = new ListNode(remain);
        }
        return newListNode;
    }


 /*   public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long sum = 0;
        int counter = 1;
        ListNode nextNode = l1;
        while (nextNode != null) {
            sum += (long) counter * nextNode.val;
            nextNode = nextNode.next;
            counter *= 10;
        }
        counter = 1;
        nextNode = l2;
        while (nextNode != null) {
            sum += (long) counter * nextNode.val;
            nextNode = nextNode.next;
            counter *= 10;
        }

        int remain = (int) (sum % 10);
        sum/=10;
        ListNode leftHead = new ListNode(remain);
        ListNode next = leftHead;
        while (sum > 0) {
            remain = (int) sum % 10;
            ListNode newNode = new ListNode(remain);
            next.next = newNode;
            next = newNode;
            sum /= 10;
        }
        return leftHead;
    }*/

    public static void printNode(ListNode node) {
        System.err.println("****************************");
        ListNode next = node;
        while (next != null) {
            System.err.println(next.val);
            next = next.next;
        }
    }

}

