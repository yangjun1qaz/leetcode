package com.honey.leetcode.leetcode.editor.cn.hashcodetest;

import java.util.*;
import java.util.stream.Collectors;

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
        int[] ints = hash2.stream().mapToInt(Integer::intValue).toArray();
        return ints ;
    }

    public static void main(String[] args) {
        int[] mun1={1,2,2,1};
        int[] mun2={2,2};


    }


    public static void test() {
        List<? extends Number> l1 = new ArrayList<>();
         //l1.add(1);// 会报错

        List<? super Number> l2 = new ArrayList<>();
        // Number n = l2.get(1); //会报错
        l2.add(1);
        l2.add(2);
        l2.add(0.11);
        for(Object n: l2) {
            System.out.println(n.toString());
        }
    }

}
