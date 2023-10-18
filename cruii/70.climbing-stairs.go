/*
 * @lc app=leetcode.cn id=70 lang=golang
 * @lcpr version=30102
 *
 * [70] 爬楼梯
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
func climbStairs(n int) int {
	// if n == 1 {
	// 	return 1
	// }

	// if n == 2 {
	// 	return 2
	// }

	// return climbStairs(n - 2) + climbStairs(n - 1)

	a, b, r := 0, 0, 1
	for i := 1; i <= n; i++ {
		b = a
		a = r
		r = a + b
	}

	return r
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

 */

