package com.honey.leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Brayden
 * @date ：Created in 2021/9/29 14:01
 * @description：三数之和 15
 * @modified By：
 * @version:
 */
public class Array3 {
    public List<List<Integer>> dealData(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (nums.length < 3) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }

        }
        return result;

    }

    public static void main(String[] args) {

    }
}
