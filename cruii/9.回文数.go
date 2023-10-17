/*
 * @lc app=leetcode.cn id=9 lang=golang
 *
 * [9] 回文数
 */

// @lc code=start
func isPalindrome(x int) bool {
	if x<0 || (x%10 == 0 && x != 0) {
		return false
	}

	// 已反转的数字
	rNum := 0
	for ; rNum < x; x /= 10 {
		rNum = rNum * 10 + x % 10
	}

	if rNum == x || rNum /10 == x {
		return true
	}

	return false
}
// @lc code=end

