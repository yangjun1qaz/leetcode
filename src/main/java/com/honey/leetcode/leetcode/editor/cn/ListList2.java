package com.honey.leetcode.leetcode.editor.cn;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/15 14:05
 * @description：两两交换链表中的节点
 * @modified By：
 * @version:
 */
public class ListList2 {
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = pre.next;
        while (cur != null && cur.next != null) {
            ListNode temp = cur.next;
            pre.next = temp;
            cur.next = temp.next;
            temp.next = cur;

            pre=pre.next.next;
            cur=pre.next;

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode listNode1 = swapPairs(listNode);
        ListNode cur=listNode1;
        while(cur!=null){
            System.out.print(cur.val+"------>");
            cur=cur.next;
        }
    }
}
