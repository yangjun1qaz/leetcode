package com.honey.leetcode.leetcode.editor.cn.stringtest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/11/2 11:16
 * @description：回文字符串
 * @modified By：
 * @version:
 */
public class String9 {

    //暴力解法
    public boolean isPalindrome1(String s) {
        int length = s.length();
        if (length <= 1) {
            return true;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    //双指针
    public boolean isPalindrome2(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            while (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;

            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        String9 string9 = new String9();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(string9.isPalindrome1(s));
        System.out.println(string9.isPalindrome2(s));
    }
}
