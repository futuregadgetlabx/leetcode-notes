/*
 * @lc app=leetcode.cn id=21 lang=golang
 * @lcpr version=30102
 *
 * [21] 合并两个有序链表
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeTwoLists(n *ListNode, m *ListNode) *ListNode {
	// dummy := &ListNode{}
	// cur := dummy
	// for n != nil && m != nil {
	// 	if n.Val < m.Val {
	// 		cur.Next = n
	// 		n = n.Next
	// 	} else {
	// 		cur.Next = m
	// 		m = m.Next
	// 	}
	// 	cur = cur.Next
	// }

	// if n != nil {
	// 	cur.Next = n
	// } else {
	// 	cur.Next = m 
	// }

	// return dummy.Next


	if n == nil {
		return m 
	}

	if m == nil {
		return n 
	}

	if n.Val < m.Val {
		n.Next = mergeTwoLists(n.Next, m)
		return n
	}

	m.Next = mergeTwoLists(n, m.Next)
	return m
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,4]\n[1,3,4]\n
// @lcpr case=end

// @lcpr case=start
// []\n[]\n
// @lcpr case=end

// @lcpr case=start
// []\n[0]\n
// @lcpr case=end

 */

