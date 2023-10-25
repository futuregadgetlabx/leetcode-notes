/*
 * @lc app=leetcode.cn id=88 lang=golang
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
func merge(nums1 []int, m int, nums2 []int, n int)  {
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

	for i := n-1; i >= 0; i-- {
		nums1[p-1] = nums2[i]
		p--
	}

	fmt.Println(nums1)
}
// @lc code=end

