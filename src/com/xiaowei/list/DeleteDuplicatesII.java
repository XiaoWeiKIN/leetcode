package com.xiaowei.list;

import com.xiaowei.core.ListNode;

/**
 * @Author: wangxw
 * @DateTime: 2021/3/27
 * @Description: 删除链表重复节点2
 * 1 1 1 2 2 3 4
 */
public class DeleteDuplicatesII {


    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;

    }
}
