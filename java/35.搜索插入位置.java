/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
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

