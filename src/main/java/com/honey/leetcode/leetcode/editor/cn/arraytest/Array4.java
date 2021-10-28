package com.honey.leetcode.leetcode.editor.cn.arraytest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/9/29 16:09
 * @description：单链表反转
 * @modified By：
 * @version:
 */
public class Array4 {

    public static ListNode dealData(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        ListNode temp=null;
        while(cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
        ListNode listNode1 = dealData(listNode);
//        while(listNode!=null){
//            System.out.print(listNode.val+"--->");
//            listNode=listNode.next;
//        }
        while(listNode1!=null){
            System.out.print(listNode1.val+"--->");
            listNode1=listNode1.next;
        }
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
