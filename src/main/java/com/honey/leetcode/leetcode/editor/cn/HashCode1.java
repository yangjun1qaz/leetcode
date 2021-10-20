package com.honey.leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/20 10:08
 * @description： 查找共用字符
 * 给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答案。
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 * @modified By：
 * @version:
 */
public class HashCode1 {
    public static List<String> commonChars(String[] A) {
        ArrayList<String> result = new ArrayList<>();
        if (A.length == 0) {
            return result;
        }
        int[] hash = new int[26];
        for (int i = 0; i < A[0].length(); i++) {
            hash[A[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            int[] otherHash = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                otherHash[A[i].charAt(j) - 'a']++;
            }
            //过滤
            for (int k = 0; k < hash.length; k++) {
                hash[k] = Math.min(hash[k], otherHash[k]);
            }
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                for (int j = 0; j < hash[i]; j++) {
                    result.add((char) (i + 'a') + "");
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String[] ss = new String[]{"bella", "label", "roller"};
        List<String> strings = commonChars(ss);
    }
}
