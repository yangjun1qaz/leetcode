package com.honey.leetcode.leetcode.editor.cn.stringtest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/29 9:04
 * @description：题目：28. 实现 strStr() KMP
 * @modified By：
 * @version:
 */
public class String6 {
    public static int bf(String ts, String ps) {
        char[] t = ts.toCharArray();
        char[] p = ps.toCharArray();
        int i = 0; // 主串的位置
        int j = 0; // 模式串的位置
        while (i < t.length && j < p.length) {
            if (t[i] == p[j]) { // 当两个字符相同，就比较下一个
                i++;
                j++;
            } else {
                i = i - j + 1; // 一旦不匹配，i后退
                j = 0; // j归0
            }
        }
        if (j == p.length) {
            return i - j;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int bf = String6.bf("asdadfdfasf", "asf");
        System.out.println(bf);
    }
}





