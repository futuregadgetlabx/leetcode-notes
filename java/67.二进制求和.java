/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 * 
 * √ Accepted
 * √ 294/294 cases passed (5 ms)
 * √ Your runtime beats 76.81 % of java submissions
 * √ Your memory usage beats 87.75 % of java submissions (34.6 MB)
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}

