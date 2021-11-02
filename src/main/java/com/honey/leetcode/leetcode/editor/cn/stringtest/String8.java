package com.honey.leetcode.leetcode.editor.cn.stringtest;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ：Brayden
 * @date ：Created in 2021/11/2 10:27
 * @description：题目459.重复的子字符串 KMP
 * @modified By：
 * @version:
 */
public class String8 {
    public static boolean repeatedSubstringPattern(String s) {
        HashSet<String> hashset = new HashSet<>();
        for (int i = 0, j = 1; i < s.length(); i++) {
            while (j <= s.length()) {
                if (s.substring(i, j).length() > 1) {
                    hashset.add(s.substring(i, j));
                }
                j++;
            }
            j = i + 1;
        }

        Iterator<String> iterator = hashset.iterator();
        while (iterator.hasNext()) {
            int flag = 0;
            String next = iterator.next();

            char[] m = s.toCharArray();
            char[] p = next.toCharArray();
            //求next数组
            int[] pi = new int[p.length];

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
                    flag++;
                    j = 0;
                }
            }
            if (flag >= 1) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(String8.repeatedSubstringPattern("bb"));
    }
}
