/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 * 
 * √ Accepted
 * √ 59/59 cases passed (0 ms)
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 90.27 % of java submissions (34.5 MB)
 */
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0 || "".equals(s)) {
            return 0;
        }
        s = s.trim();
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                return len - i - 1;
            }
        }
        return len;
    }
}

