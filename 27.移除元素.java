/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 * 
 * √ Accepted
 * √ 113/113 cases passed (1 ms)
 * √ Your runtime beats 99.62 % of java submissions
 * √ Your memory usage beats 90.08 % of java submissions (34.9 MB)
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == val) {
                nums[i--] = nums[len-- - 1];
            }
        }

        return len;
    }
}

