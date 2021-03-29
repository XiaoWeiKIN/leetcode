package com.xiaowei.core;

/**
 * @Author: wangxw
 * @DateTime: 2021/3/10
 * @Description: TODO
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
