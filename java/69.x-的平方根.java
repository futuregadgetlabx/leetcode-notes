/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 * √ Accepted
 * √ 1017/1017 cases passed (6 ms)
 * √ Your runtime beats 90.28 % of java submissions
 * √ Your memory usage beats 75.25 % of java submissions (33.6 MB)
 */
class Solution {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }

        if(x == 1){
            return 1;
        }

        int start = 1;
        int end = x / 2 + 1 ;
        int middle = 0;
        while (start <= end) {
            middle = ((end - start) >> 1) + start;
            if(middle == x / middle) {
                return middle;
            } else {
                if (middle < x / middle) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }


        }
        return end;
    }
}

