/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 * 
 * √ Accepted
 * √ 59/59 cases passed (1 ms)
 * √ Your runtime beats 98.43 % of java submissions
 * √ Your memory usage beats 90.27 % of java submissions (34.5 MB)
 */
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s.length() == 0) {
            return 0;
        }
        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i = len - 1; i > 0; i--) {
            if(arr[i] == ' ' && arr[len - 1] != ' ') {
                return len - i - 1;
            }
        }
        return len;
    }
}

