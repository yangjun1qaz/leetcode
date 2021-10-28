package com.honey.leetcode.leetcode.editor.cn.linklisttest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/13 17:06
 * @description：
 * @modified By：
 * @version:
 */
public class LinkListDemo3<E> {
    private int size;
    private Node<E> head;

    public LinkListDemo3() {
        this.size = 0;
        this.head = new Node<E>(null, null);
    }


    public void add1(E e) throws Exception {
        add(e, size);
    }

    public void add(E e, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("index error");
        }
        Node<E> pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = new Node(e, pre.next);
        size++;
    }


    public E delete(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("index error");
        }
        Node<E> pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node<E> cur = pre.next;
        pre.next = cur.next;
        size--;
        return cur.getE();
    }

    public void udpate(E e, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("index error");
        }
        Node<E> pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node<E> cur = pre.next;
        cur.setE(e);
    }


    public E get(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("index error");
        }
        Node<E> pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        Node<E> cur = pre.next;
        return cur.getE();
    }

    class Node<E> {
        private E e;
        private Node<E> next;

        public Node() {
        }

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public static void main(String[] args) throws Exception {
        LinkListDemo3<Integer> integerLinkListDemo3 = new LinkListDemo3<Integer>();
        integerLinkListDemo3.add1(1);
        integerLinkListDemo3.add1(2);
        integerLinkListDemo3.add1(3);
        for (int i = 0; i < integerLinkListDemo3.size; i++) {
            System.out.print(integerLinkListDemo3.get(i) + "-->");
        }

        integerLinkListDemo3.udpate(34, 1);
        System.out.println("----------------------");
        for (int i = 0; i < integerLinkListDemo3.size; i++) {
            System.out.print(integerLinkListDemo3.get(i) + "-->");
        }
        integerLinkListDemo3.delete(1);

        System.out.println("----------------------");
        for (int i = 0; i < integerLinkListDemo3.size; i++) {
            System.out.print(integerLinkListDemo3.get(i) + "-->");
        }
    }
}
