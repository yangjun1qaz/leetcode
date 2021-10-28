package com.honey.leetcode.leetcode.editor.cn.arraytest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/9 10:04
 * @description：长度最小的子数组
 * @modified By：
 * @version:
 */
public class Array6 {
    public int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while (end < length) {
            sum += nums[end];
            while (sum >= s) {
                sum -= nums[start];
                ans = Math.min(ans, end - start + 1);
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {

    }
}
