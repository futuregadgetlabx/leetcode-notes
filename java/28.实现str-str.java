/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 * 
 * 等学习KMP算法后再重新做该题
 * 
 * √ Accepted
 * √ 74/74 cases passed (1 ms)
 * √ Your runtime beats 99.83 % of java submissions
 * √ Your memory usage beats 96.98 % of java submissions (34.8 MB)
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        
        return haystack.indexOf(needle);
    }
}

