package com.leetcode.question.common;

import com.leetcode.question.model.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {


        ListNode listNode4 = new ListNode(8);
        ListNode listNode3 = new ListNode(7, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode = new ListNode(1, listNode2);


        ListNode listNode24 = new ListNode(9);
        ListNode listNode23 = new ListNode(6, listNode24);
        ListNode listNode22 = new ListNode(3, listNode23);
        ListNode listNode1 = new ListNode(1, listNode22);

        ListNode listNode5 = mergeTwoLists(listNode, listNode1);

        printNode(listNode5);
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstPointer = list1;
        ListNode secendPointer = list2;
        ListNode newNode = null;
        ListNode rootPointer = null;
        while (true) {
            if (firstPointer != null && secendPointer != null) {
                if (firstPointer.val <= secendPointer.val) {
                    if (newNode != null) {
                        rootPointer.next = new ListNode(firstPointer.val);
                        firstPointer = firstPointer.next;
                        rootPointer = rootPointer.next;
                    } else {
                        newNode = new ListNode(firstPointer.val);
                        firstPointer = firstPointer.next;
                        rootPointer = newNode;
                    }
                } else {
                    if (newNode != null) {
                        rootPointer.next = new ListNode(secendPointer.val);
                        secendPointer = secendPointer.next;
                        rootPointer = rootPointer.next;
                    } else {
                        newNode = new ListNode(secendPointer.val);
                        secendPointer = secendPointer.next;
                        rootPointer = newNode;
                    }
                }
            } else if (firstPointer != null) {
                if (rootPointer != null) {
                    rootPointer.next = firstPointer;
                }
                return newNode == null ? firstPointer : newNode;
            } else {
                if (rootPointer != null) {
                    rootPointer.next = secendPointer;
                }
                return newNode == null ? secendPointer : newNode;
            }
        }
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




