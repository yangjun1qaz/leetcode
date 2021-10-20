//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例 1：
//
//
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//
//
// 示例 2：
//
//
//输入：nums = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：nums = [0]
//输出：[]
//
//
//
//
// 提示：
//
//
// 0 <= nums.length <= 3000
// -105 <= nums[i] <= 105
//
// Related Topics 数组 双指针
// 👍 2916 👎 0

package com.honey.leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        int[] a = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = solution.threeSum(a);
        System.out.println(lists);
    }

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            ArrayList<List<Integer>> result = new ArrayList<>();
            if (nums.length < 3) {
                return result;
            }
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) return result;
                //去掉i的重复元素
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if (nums[i] + nums[l] + nums[r] == 0) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) ++l;
                        while (l < r && nums[r] == nums[r - 1]) --r;
                        --r;
                        ++l;
                    } else if (nums[r] + nums[l] + nums[i] < 0) {
                        ++l;
                    } else {
                        --r;
                    }
                }
            }
            return result;
        }
    }
}