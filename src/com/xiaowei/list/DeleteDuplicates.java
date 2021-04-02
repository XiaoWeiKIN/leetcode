package com.xiaowei.list;

import com.xiaowei.core.ListNode;

/**
 * @Author: wangxw
 * @DateTime: 2021/3/25
 * @Description: 删除链表重复节点
 * -1 1 1 1 2 3 4 4
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int val = cur.next.val;
                while (cur.next != null && cur.next.val == val) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }

        }

        return dummy.next;

    }
}
