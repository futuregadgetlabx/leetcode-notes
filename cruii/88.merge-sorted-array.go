/*
 * @lc app=leetcode.cn id=88 lang=golang
 * @lcpr version=30105
 *
 * [88] 合并两个有序数组
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
func merge(nums1 []int, m int, nums2 []int, n int) {
	p := m + n 
	for m > 0 && n > 0 {
		if nums1[m-1] > nums2[n-1] {
			nums1[p-1] = nums1[m-1]
			m--
		} else {
			nums1[p-1] = nums2[n-1]
			n--
		}
		p--
	}

	if n > 0 {
		copy(nums1[:n], nums2[:n])
	}

	fmt.Println(nums1)
}

// @lc code=end

/*
// @lcpr case=start
// [1,2,3,0,0,0]\n3\n[2,5,6]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n[]\n0\n
// @lcpr case=end

// @lcpr case=start
// [0]\n0\n[1]\n1\n
// @lcpr case=end

*/

