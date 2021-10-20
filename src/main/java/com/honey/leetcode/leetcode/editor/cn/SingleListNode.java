package com.honey.leetcode.leetcode.editor.cn;

/**
 * @author ：Brayden
 * @date ：Created in 2021/8/30 14:09
 * @description：
 * @modified By：
 * @version:
 */
public class SingleListNode<T> {

    class ListNode<T> {
        T val;
        ListNode<T> next;

        public ListNode() {
        }

        public ListNode(T val) {
            this.val = val;
        }

        public ListNode(T val, ListNode<T> next) {
            this.val = val;
            this.next = next;
        }
    }

    private ListNode<T> head;
    private ListNode<T> tail;
    private int size;

    public ListNode<T> getHead() {
        return head;
    }

    public void setHead(ListNode<T> head) {
        this.head = head;
    }

    public ListNode<T> getTail() {
        return tail;
    }

    public void setTail(ListNode<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleListNode() {
    }

    public  void add(ListNode listNode) throws Exception {
        add(listNode,size+1);
    }
    public void add(ListNode listNode, int index) throws Exception {
        ListNode temp=head;
        if (index > size) {
            throw new Exception("index 不合法");
        }
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        ListNode<T> tListNode = new ListNode<>();
        tListNode.next=temp.next;
        temp.next=tListNode;
    }


}
