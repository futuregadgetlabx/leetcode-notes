/*
 * @lc app=leetcode.cn id=14 lang=golang
 * @lcpr version=30102
 *
 * [14] 最长公共前缀
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
func longestCommonPrefix(strs []string) string {
	if len(strs) == 0 {
		return ""
	}

	ans := strs[0]
	for i := 1; i < len(strs); i++ {
		j := 0
		for ;j < len(ans) && j < len(strs[i]); j++ {
			if ans[j] != strs[i][j] {
				break
			}
		}
		ans = ans[:j]
		if ans == "" {
			return ans
		}
	}

	return ans
}
// @lc code=end



/*
// @lcpr case=start
// ["flower","flow","flight"]\n
// @lcpr case=end

// @lcpr case=start
// ["dog","racecar","car"]\n
// @lcpr case=end

 */

