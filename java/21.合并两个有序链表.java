/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 * 
 * √ Accepted
 * √ 208/208 cases passed (2 ms)
 * √ Your runtime beats 97.22 % of java submissions
 * √ Your memory usage beats 90.99 % of java submissions (35.2 MB)
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
            
        if(l2 == null){
            return l1;
        }
        
        if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
        
    }
}

