package com.honey.leetcode.leetcode.editor.cn.dubblopointer;

/**
 * @author ：Brayden
 * @date ：Created in 2021/11/4 16:39
 * @description：给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并「原地」修改输入数组。
 * @modified By：
 * @version:
 */
public class Test1 {

    public static  int deal(int[] arr, int val) {
        int slow = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[slow]=arr[i];
                slow++;
            }
        }
        return slow;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,56,6,7,7,7};
        int deal = Test1.deal(arr, 7);
        System.out.println(deal);
    }
}
