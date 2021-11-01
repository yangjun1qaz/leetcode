package com.honey.leetcode.leetcode.editor.cn.stringtest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/28 15:48
 * @description：
 * @modified By：
 * @version:
 */
public class String5 {
    public String deal(String s, int i) {
        if (i > s.length()) {
            return s;
        }
        String substring = s.substring(0, i);
        System.out.println(s);
        String substring1 = s.substring(i, s.length());
        return substring1 + substring;
    }

    public static void main(String[] args) {
        String5 string5 = new String5();
        System.out.println(string5.deal("abcdefg",2));
        int s=3;
    }
}
