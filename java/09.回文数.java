/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 * 
 * √ Accepted
 * √ 11509/11509 cases passed (54 ms)
 * √ Your runtime beats 75.81 % of java submissions
 * √ Your memory usage beats 85.16 % of java submissions (38.3 MB)
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        
        if (x < 0) {
            return false;
        }

        if (x % 10 == 0){
            return false;
        }

        int[] numbers = new int[String.valueOf(x).length()];
        int index = 0;
        while(x != 0) {
            numbers[index] = x % 10;
            x /= 10;
            index++;
        }
        boolean isPalindrome = true;
        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length -1 -i]) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}

