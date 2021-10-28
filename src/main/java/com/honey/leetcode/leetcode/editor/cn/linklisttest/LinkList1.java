package com.honey.leetcode.leetcode.editor.cn.linklisttest;


/**
 * @author ：Brayden
 * @date ：Created in 2021/10/14 17:35
 * @description：链表删除元素
 * @modified By：
 * @version:
 */
public class LinkList1 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode pre=dummy;
        ListNode cur=pre.next;
        while(cur!=null){
            if(val==cur.val){
                pre.next=cur.next;
            }
            pre=cur;
            cur=cur.next;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}