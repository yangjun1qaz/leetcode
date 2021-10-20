package com.honey.leetcode.leetcode.editor.cn;

/**
 * @author ：Brayden
 * @date ：Created in 2021/9/15 16:17
 * @description：
 * @modified By：
 * @version:
 */
public class ManyWater {

    public static int deal(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int temp=0;
        while(l<r){
            temp=Math.max(Math.min(height[r],height[l])*(r-l),temp);
            if(height[l]<height[r]){
                l++;
            }else{

                r--;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
     int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(deal(a));
    }
}
