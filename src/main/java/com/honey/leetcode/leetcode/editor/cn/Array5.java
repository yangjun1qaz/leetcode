package com.honey.leetcode.leetcode.editor.cn;

import java.util.HashSet;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/8 16:00
 * @description：环形链表
 * @modified By：
 * @version:
 */
public class Array5 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> listNodes = new HashSet<>();
        ListNode pos=head;

        while(pos!=null){
            if(listNodes.contains(pos)){
                return pos;
            }else{
                listNodes.add(pos);
                pos=pos.next;
            }
        }
        return null;
    }
}
