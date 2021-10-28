package com.honey.leetcode.leetcode.editor.cn.stringtest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/28 10:32
 * @description：请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * @modified By：
 * @version:
 */
public class String3 {
    public String re(String ss) {
        String s = ss.replaceAll(" ", "%20");
        return s;
    }

    public static void main(String[] args) {
        String3 string3 = new String3();
        String re = string3.re("We are happy.");
        System.out.println(re);
    }
}
