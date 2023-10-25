/*
 * @lc app=leetcode.cn id=20 lang=golang
 *
 * [20] 有效的括号
 */

// @lc code=start
func isValid(s string) bool {
	n := len(s)
	if n%2 == 1 {
		return false
	}

	tab := map[byte]byte{
		')': '(',
		']': '[',
		'}': '{',
	}

	stack := make([]byte, 0)
	for i := 0; i < n; i++ {
		// 是否右括号
		if tab[s[i]] > 0 {
			// 1. 是栈底则无法正确闭合
			// 2. 括号是否配对
			if len(stack) == 0 || stack[len(stack)-1] != tab[s[i]] {
				return false
			}
			// 配对则弹出左括号
			stack = stack[:len(stack)-1]
		} else {
			// 压入左括号
			stack = append(stack, s[i])
		}
	}

	return len(stack) == 0
}

// @lc code=end

