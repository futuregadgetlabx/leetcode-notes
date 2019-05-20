/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 * √ Accepted
 * √ 62/62 cases passed (1 ms)
 * √ Your runtime beats 96.68 % of java submissions
 * √ Your memory usage beats 81.37 % of java submissions (37.8 MB)
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target == 0 || nums.length == 0 || target <= nums[0]) {
            return 0;
        }

        int start = 0;
        int end = nums.length;
        int middle;
        while(start < end) {
            middle = ((end - start) >> 1) + start;
            if (target > nums[middle]) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return end;
    }
}

