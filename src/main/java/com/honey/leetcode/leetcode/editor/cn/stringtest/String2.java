package com.honey.leetcode.leetcode.editor.cn.stringtest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/27 11:01
 * @description：541. 反转字符串 II
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * @modified By：
 * @version:
 */
public class String2 {
    public String reverseStr(String s, int k) {

        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i += 2 * k) {
            rever(chars,i,Math.min(i+k,len)-1);
        }
       return  new String(chars);
    }

    private void rever(char[] chars, int l, int r) {
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    }


    public static void main(String[] args) {
        String2 string2 = new String2();
        string2.reverseStr("abcd23", 2);
    }
}
