/*
 * @lc app=leetcode.cn id=27 lang=golang
 * @lcpr version=30105
 *
 * [27] 移除元素
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
func removeElement(nums []int, val int) int {
    left, right := 0, len(nums)-1
    for left <= right {
        if nums[left] == val {
            nums[left] = nums[right]
            right--
        } else {
            left++
        }
    }

    return left
}

// @lc code=end

/*
// @lcpr case=start
// [3,2,2,3]\n3\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,2,3,0,4,2]\n2\n
// @lcpr case=end

*/

