package main

type ListNode struct {
	Val  int
	Next *ListNode
}

// 日期：2023-07-1769_01
// 作者：仲景
func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
	// 特殊判断：有链表是空的
	if list1 == nil || list2 == nil {
		if list1 == nil {
			return list2
		} else {
			return list1
		}
	}

	// 创建一个新头
	newHead := &ListNode{}
	p := newHead

	// 遍历两个链表，直到某个链表遍历完
	node1, node2 := list1, list2
	for node1 != nil && node2 != nil {
		if node1.Val < node2.Val {
			p.Next = node1
			node1 = node1.Next
		} else {
			p.Next = node2
			node2 = node2.Next
		}
		p = p.Next
	}

	// 把没遍历完的剩余链表加到最后
	if node1 != nil {
		p.Next = node1
	}

	if node2 != nil {
		p.Next = node2
	}

	return newHead.Next
}
