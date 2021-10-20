//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
//

//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 
// 👍 187 👎 0

package editor.cn;

import java.util.Arrays;

public class ShunShiZhenDaYinJuZhenLcof {
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        int[][] array={{1,2,3},{4,5,6},{7,8,9}};
        int[] ints = solution.spiralOrder(array);
        System.out.println(Arrays.toString(ints));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] spiralOrder(int[][] matrix) {

            if (matrix.length == 0) {
                return new int[0];
            }
            //定义四个边界
            int l = 0;
            int r = matrix[0].length - 1;
            int t = 0;
            int b = matrix.length - 1;
            int x = 0;
            int[] res = new int[(r + 1) * (b + 1)];

            while (true) {
                //处理上边界
                for (int i = l; i <= r; i++) {
                    res[x++] = matrix[t][i];
                }
                if (++t > b) {
                    break;
                }

                //处理右边界
                for (int i = t; i <= b; i++) {
                    res[x++] = matrix[i][r];
                }
                if (l > --r) {
                    break;
                }

                //处理下边界

                for (int i = r; i >= l; i--) {
                    res[x++] = matrix[b][i];
                }
                if (--b < t) {
                    break;
                }

                //处理左边界

                for (int i = b; i >= t; i--) {
                    res[x++] = matrix[i][l];
                }
                if (l++ > r) {
                    break;
                }

            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}