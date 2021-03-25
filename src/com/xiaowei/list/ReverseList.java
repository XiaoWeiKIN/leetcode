package com.xiaowei.list;

import com.xiaowei.core.ListNode;

import javax.xml.soap.Node;

/**
 * @Author: wangxw
 * @DateTime: 2021/3/23
 * @Description: 反转链表 1 2 3 4
 */
public class ReverseList {


    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        // pre 正好是最后的节点
        return pre;
    }
}
