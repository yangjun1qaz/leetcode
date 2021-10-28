package com.honey.leetcode.leetcode.editor.cn.linklisttest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/18 16:08
 * @description：删除链表的倒数第 N 个结点
 * @modified By：
 * @version:
 */
public class Linklist3 {
    public ListNode removeNthFromEnd(ListNode head, int n) throws Exception {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode pre = dummy;
        ListNode cur = dummy.next;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        ListNode pre1 = dummy;
        ListNode cur1 = dummy.next;
        for (int i = 0; i < size - n; i++) {
            cur1 = cur1.next;
            pre1 = pre1.next;
        }
        pre1.next = cur1.next;
        return dummy.next;

    }
}
