//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 示例 3： 
//
// 
//输入：s = "a"
//输出："a"
// 
//
// 示例 4： 
//
// 
//输入：s = "ac"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母（大写和/或小写）组成 
// 
// Related Topics 字符串 动态规划 
// 👍 3115 👎 0

package editor.cn;

import org.springframework.util.StringUtils;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
        String cbbd = solution.longestPalindrome("abc");
        System.out.println(cbbd);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String ss="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String substring = s.substring(i, j);
                String reverse = new StringBuilder(substring).reverse().toString();
                if(substring.equals(reverse)){
                    if(ss.length()<substring.length()){
                        ss=substring;
                    }
                }
            }
        }
        return ss;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}