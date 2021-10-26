package com.honey.leetcode.leetcode.editor.cn;

import java.util.*;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/20 16:13
 * @description：349 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 * @modified By：
 * @version:
 */
public class HashCode2 {
    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hash.add(nums1[i]);
        }
        HashSet<Integer> hash2 = new HashSet<>();
        for(int i =0;i<nums2.length;i++){
           if(hash.contains(nums2[i])) {
               hash2.add(nums2[i]);
           }
        }
        int i=0;
        int[] result=new int[hash2.size()];
        Iterator<Integer> iterator = hash2.iterator();
        while(iterator.hasNext()){
            result[i]=iterator.next();
            i++;
        }

        return result ;
    }

    public static void main(String[] args) {
        int[] mun1={1,2,2,1};
        int[] mun2={2,2};
    }
}
