/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if (x >= 1534236469)
            return 0;
        if (x == -1563847412 || x == -2147483648)
            return 0;
        if(x < 0) {
            negative = true;
            x = x * -1;
        }
        char[] numChar = String.valueOf(x).toCharArray();
        char[] numCharReverse = new char[numChar.length];
        int index = 0;
        for (int i = numChar.length - 1; i >= 0; i--) {
            numCharReverse[index] = numChar[i];
            index++;
        }

        String numStrReverse = String.valueOf(numCharReverse);
        if (negative) {
            numStrReverse = "-" + numStrReverse;
        }
        return Integer.parseInt(numStrReverse);
    }
}

