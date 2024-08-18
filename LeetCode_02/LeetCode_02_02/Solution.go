package LeetCode_02

type ListNode struct {
	Val  int
	Next *ListNode
}

// 日期：2023-07-02
// 作者：仲景
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	newHead := &ListNode{}
	node, node1, node2 := newHead, l1, l2
	num := 0

	for node1 != nil || node2 != nil {
		val1, val2 := 0, 0
		if node1 != nil {
			val1 = node1.Val
			node1 = node1.Next
		}
		if node2 != nil {
			val2 = node2.Val
			node2 = node2.Next
		}

		sum := num + val1 + val2
		cur := sum % 10
		num = sum / 10

		node.Next = &ListNode{Val: cur}
		node = node.Next
	}

	if num > 0 {
		node.Next = &ListNode{Val: num}
	}

	return newHead.Next
}
