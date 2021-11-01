package com.honey.leetcode.leetcode.editor.cn.stringtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/28 15:25
 * @description：151
 * 给你一个字符串 s ，逐个翻转字符串中的所有 单词 。
 * //
 * // 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * //
 * // 请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
 * //
 * // 说明：
 * //
 * //
 * // 输入字符串 s 可以在前面、后面或者单词间包含多余的空格。
 * // 翻转后单词间应当仅用一个空格分隔。
 * // 翻转后的字符串中不应包含额外的空格。
 * //
 * //
 * //
 * //
 * // 示例 1：
 * //
 * //
 * //输入：s = "the sky is blue"
 * //输出："blue is sky the"
 * @modified By：
 * @version:
 */
public class String4 {
    public String reverseWords(String s) {
         s = s.trim();
        List<String> strings = Arrays.asList(s.split("\\s+"));
        Collections.reverse(strings);
        return String.join(" ",strings);

    }

    public static void main(String[] args) {
        String4 string4 = new String4();
        String ss = string4.reverseWords("the sky is blue");
        System.out.println(ss);
    }
}
