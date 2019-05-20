/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 * 
 * √ Accepted
 * √ 29/29 cases passed (48 ms)
 * √ Your runtime beats 42.65 % of java submissions
 * √ Your memory usage beats 84.63 % of java submissions (37.7 MB)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return nums;
    }
}

