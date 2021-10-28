package com.honey.leetcode.leetcode.editor.cn.linklisttest;


/**
 * @author ：Brayden
 * @date ：Created in 2021/7/28 17:13
 * @description：
 * @modified By：
 * @version:
 */
public class LinkListDemo<E> {

    private Node<E> head;
    private int size;

    public LinkListDemo() {
        this.head = new Node(null, null);
        this.size = 0;
    }

    //增加节点
    public void add(E e) {
        add(e, size);
    }

    public void add(E e, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        }
        Node prve = head;
        for (int i = 0; i < index; i++) {
            prve = prve.next;
        }
        prve.next = new Node(e, prve.next);
        size++;
    }

    //删除节点
    public E delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        }
        Node<E> prve = head;
        for (int i = 0; i < index; i++) {
            prve = prve.next;
        }
        Node<E> cur = prve.next;
        prve.next = cur.next;
        cur.next = null;
        --size;
        return cur.e;
    }

    //更新节点
    public void update(E e, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        }
        Node cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    //查询
    public E get(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        }
        Node<E> cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }


    public class Node<E> {
        private E e;
        private Node<E> next;

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }

        public E getE() {
            return e;
        }

        public Node<E> getNext() {
            return next;
        }
    }

    public static void main(String[] args) {
        LinkListDemo<Integer> linkList = new LinkListDemo<Integer>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        for (int i = 0; i < linkList.size; i++) {
            System.out.println(linkList.get(i));
        }
        linkList.update(4, 2);
        System.out.println("------------------");
        for (int i = 0; i < linkList.size; i++) {
            System.out.println(linkList.get(i));
        }
        System.out.println("------------------");
        linkList.delete(1);
        for (int i = 0; i < linkList.size; i++) {
            System.out.println(linkList.get(i));
        }
    }
}
