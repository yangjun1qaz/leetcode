package com.honey.leetcode.leetcode.editor.cn;

/**
 * @author ：Brayden
 * @date ：Created in 2021/9/27 16:24
 * @description：搜索插入位置
 * @modified By：
 * @version:
 */
public class Array1 {

    public static  int dealData(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        if (target <= nums[l]) {
            return 0;
        }
        if (target > nums[r]) {
            return nums.length;
        }
        while (l < r) {
            int mid=(l+r)>>1;
            if(target>nums[mid]){
                if(target<=nums[mid+1]){
                    return mid+1;
                }
                l++;
            }else if(target<nums[mid]){
                if(target>=nums[mid-1]){
                    return mid-1;
                }
                r--;
            }else{
                return mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       int[] a={1,3};
        int i = dealData(a, 3);
        System.out.println(i);
    }
}
