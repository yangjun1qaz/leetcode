package com.honey.leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ：Brayden
 * @date ：Created in 2021/8/23 15:22
 * @description：
 * @modified By：
 * @version:
 */
public class Test {


    public static class ListNode {
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

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carray = 0;
        while (l1 != null || l2 != null) {
            int i = l1 != null ? l1.val : 0;
            int n = l2 != null ? l2.val : 0;
            int sum = i + n + carray;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carray = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carray > 0) {
            tail.next = new ListNode(carray);
        }
        return head;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] list1 = getList(l1);
        int[] list2 = getList(l2);
        int[] temp = list1;
        if (list1.length < list2.length) {
            list1 = list2;
            list2 = temp;
        }
        ListNode listNode = new ListNode();
        ListNode prve = listNode;
        Boolean flag = false;
        for (int i = 0; i < list1.length; i++) {
            ListNode listNode1 = new ListNode();
            int val2 = 0;
            if (i < list2.length) {
                int val1 = list1[i] + list2[i];

                if (flag) {
                    val1++;
                }
                if (val1 >= 10) {
                    flag = true;
                    val2 = val1 % 10;
                } else {
                    flag = false;
                    val2 = val1;
                }

            } else {
                int val3 = 0;
                if (flag) {
                    val3 = ++list1[i];
                } else {
                    val3 = list1[i];
                }
                if (val3 >= 10) {
                    flag = true;
                    val2 = val3 % 10;
                } else {
                    flag = false;
                    val2 = val3;
                }
            }

            listNode1.val = val2;
            prve.next = listNode1;
            prve = prve.next;
        }
        if (flag) {
            ListNode listNode1 = new ListNode();
            listNode1.val = 1;
            prve.next = listNode1;
        }
        return listNode.next;
    }

    private static int[] getList(ListNode l1) {
        int[] ints = new int[getSize(l1)];
        int i = 0;
        ListNode prve = l1;
        while (prve != null) {
            ints[i] = prve.val;
            i++;
            prve = prve.next;
        }
        return ints;
    }

    private static int getSize(ListNode l1) {
        int i = 0;
        ListNode prve = l1;
        while (prve != null) {
            i++;
            prve = prve.next;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] l1 = {9, 9, 9, 9, 9, 9, 9};
        int[] l2 = {9, 9, 9, 9};
        ListNode head1 = new ListNode();
        ListNode temp = head1;
        for (int i = 0; i < l1.length; i++) {
            ListNode listNode1 = new ListNode();
            listNode1.val = l1[i];
            temp.next = listNode1;
            temp = temp.next;
        }
        ListNode head2 = new ListNode();
        ListNode temp2 = head2;
        for (int i = 0; i < l2.length; i++) {
            ListNode listNode2 = new ListNode();
            listNode2.val = l1[i];
            temp2.next = listNode2;
            temp2 = temp2.next;
        }
//        ListNode listNode = addTwoNumbers(head1.next, head2.next);
//        ListNode prveresult = listNode.next;
//        while (prveresult != null) {
//            System.out.println(prveresult.val);
//            prveresult = prveresult.next;
//        }

        ListNode listNode = addTwoNumbers1(head1.next, head2.next);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}
