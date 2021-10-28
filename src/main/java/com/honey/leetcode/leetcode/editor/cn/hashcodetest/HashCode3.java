package com.honey.leetcode.leetcode.editor.cn.hashcodetest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description：454 给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：
 * <p>
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 * @Date: Created in 2021/10/26 21:53
 * @Author Brayden
 * @Version 1.0
 */
public class HashCode3 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map <Integer, Integer> result = new HashMap <>();
        for (int v : nums1) {
            for (int u : nums2) {
                result.put(u + v, result.getOrDefault(u + v, 0) + 1);
            }
        }
        int ans = 0;
        for (int v : nums3) {
            for (int u : nums4) {
                if (result.containsKey(-u - v)) {
                    ans += result.get(-u - v);
                }
            }
        }

        return ans;
    }
}
