/*
 * @lc app=leetcode.cn id=13 lang=golang
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
func romanToInt(s string) int {
	tab := map[byte]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,	
	}
	res := 0
	for i := 0; i < len(s) - 1; i++ {
		if tab[s[i]] < tab[s[i+1]] {
			res -= tab[s[i]]
		} else {
			res += tab[s[i]]
		}
	}
	res += tab[s[len(s) - 1]]
	return res
}
// @lc code=end

