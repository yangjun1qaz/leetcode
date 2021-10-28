package com.honey.leetcode.leetcode.editor.cn.arraytest;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/9 10:44
 * @description：螺旋矩阵 II
 * @modified By：
 * @version:
 */
public class Array7 {
    public int[][] generateMatrix(int n) {
        int[][] ints = new int[n][n];
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;
        int sum = 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                ints[top][column] = sum;
                sum++;
            }
            for (int row = top + 1; row <= bottom; row++) {
                ints[row][right] = sum;
                sum++;
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    ints[bottom][column] = sum;
                    sum++;
                }
                for (int row = bottom; row > top; row--) {
                    ints[row][left] = sum;
                    sum++;
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return ints;
    }
}
