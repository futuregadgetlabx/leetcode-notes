/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 * 
 * √ Accepted
 * √ 109/109 cases passed (1 ms)
 * √ Your runtime beats 88.44 % of java submissions
 * √ Your memory usage beats 54.91 % of java submissions (34.7 MB)
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len - 1] != 9) {
            int last = digits[len - 1];
            digits[len - 1] = last + 1;
            return digits;
        }
        
        int res;
        for (int i = len - 1; i >= 0; i--) {
            res = digits[i] + 1;
            if(res > 9) {
                digits[i] = 0;
            } else {
                digits[i] = res;
                break;
            }
        }
        if(digits[0] == 0){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}

