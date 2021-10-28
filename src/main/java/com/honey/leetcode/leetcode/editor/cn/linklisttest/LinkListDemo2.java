package com.honey.leetcode.leetcode.editor.cn.linklisttest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/9/15 14:30
 * @description：
 * @modified By：
 * @version:
 */
public class LinkListDemo2<T> {

    private Node<T> head;
    private int size;

    public LinkListDemo2(Node<T> head, int size) {
        this.head = head;
        this.size = size;
    }

    public LinkListDemo2() {
        this.head = new Node<>(null, null);
        this.size = 0;
    }


    public void add1(T val) {
        add(val, size);
    }

    public void add(T val, int index) {
        if (index < 0 || index > size) {
            System.out.println("index error");
        }
        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = new Node<>(val, pre.next);
        size++;
    }


    public T delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("index error");
        }
        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node<T> cur = pre.next;
        pre.next = cur.next;
        size--;
        return cur.val;
    }

    public void update(int index, T val) {
        if (index < 0 || index > size) {
            System.out.println("index error");
        }
        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node<T> cur = pre.next;
        cur.setVal(val);
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            System.out.println("index error");
        }
        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node<T> cur = pre.next;
        return cur.val;
    }


    public static void main(String[] args) {
        LinkListDemo2<Integer> integerLinkListDemo2 = new LinkListDemo2<>();
        integerLinkListDemo2.add1(1);
        integerLinkListDemo2.add1(2);
        integerLinkListDemo2.add1(3);
       for(int i=0;i<integerLinkListDemo2.size;i++){
           System.out.println(integerLinkListDemo2.get(i));
       }
        System.out.println("-----------------------------");
        integerLinkListDemo2.update(2,34334);
        for(int i=0;i<integerLinkListDemo2.size;i++){
            System.out.println(integerLinkListDemo2.get(i));
        }
        System.out.println("-----------------------------");
        integerLinkListDemo2.delete(0);
        for(int i=0;i<integerLinkListDemo2.size;i++){
            System.out.println(integerLinkListDemo2.get(i));
        }
    }

    public class Node<T> {
        private T val;
        private Node<T> next;

        public Node(T val, Node<T> next) {
            this.val = val;
            this.next = next;
        }

        public T getVal() {
            return val;
        }

        public void setVal(T val) {
            this.val = val;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
