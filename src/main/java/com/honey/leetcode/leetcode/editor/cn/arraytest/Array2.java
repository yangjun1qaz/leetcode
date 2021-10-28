package com.honey.leetcode.leetcode.editor.cn.arraytest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/9/27 17:16
 * @description：移除元素
 * @modified By：
 * @version:
 */
public class Array2 {
    public static int dealdata(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right-1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    public static int dealdata1(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if(nums[fast]==val){
                fast++;
            }else{
                nums[slow]=nums[fast];
                fast++;
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,7,7, 2, 2};
        int target = 2;
        int dealdata = dealdata1(nums, target);
        System.out.println(dealdata);
    }
}
