package com.leetcode.question.model;

public class ListNode {
    public Integer val;
    public ListNode next;  ///12321312

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}