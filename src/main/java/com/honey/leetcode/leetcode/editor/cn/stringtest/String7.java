package com.honey.leetcode.leetcode.editor.cn.stringtest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/11/1 15:06
 * @description：题目：28. 实现 strStr() KMP
 * @modified By：
 * @version:
 */
public class String7 {
    public static int strStr(String haystack, String needle) {
        char[] m = haystack.toCharArray();
        char[] p = needle.toCharArray();
        if (p.length == 0) {
            return 0;
        }
        int[] pi = new int[p.length];
        //求next数组

        for (int i = 1, j = 0; i < p.length; i++) {
            while (j > 0 && p[i] != p[j]) {
                j = pi[j - 1];
            }

            if (p[i] == p[j]) {
                j++;
            }
            pi[i] = j;
        }

        for (int i = 0, j = 0; i < m.length; i++) {
            while (j > 0 && m[i] != p[j]) {
                j = pi[j - 1];
            }
            if (m[i] == p[j]) {
                j++;
            }
            if (j == p.length) {
                return (i - j) + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int bf = String7.strStr("ababababca", "abababca");
        System.out.println(bf);
    }
}
