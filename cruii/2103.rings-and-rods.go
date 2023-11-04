/*
 * @lc app=leetcode.cn id=2103 lang=golang
 * @lcpr version=30105
 *
 * [2103] 环和杆
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
func countPoints(rings string) int {
    n := len(rings)
    if len(rings) < 6 {
        return 0
    }
    s := "0123456789"
    res := 0
    for i, _ := range s {
        r,g,b := false,false,false
        for j:=1; j<n;j++ {
            if rings[j] == s[i] {
                if rings[j-1] == 'R' {
                    r = true
                }else if rings[j-1] == 'G' {
                    g = true
                }else{
                    b = true
                }
            }
        }
        if r&&g&&b {
            res++
        }
    }

    return res
}

// @lc code=end

/*
// @lcpr case=start
// "B0B6G0R6R0R6G9"\n
// @lcpr case=end

// @lcpr case=start
// "B0R0G0R9R0B0G0"\n
// @lcpr case=end

// @lcpr case=start
// "G4"\n
// @lcpr case=end

*/

