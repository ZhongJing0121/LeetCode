package main

import (
	"errors"
)

type ListNode struct {
	Val  int
	Next *ListNode
}

// 题解一
// 日期：2023-07-03
// 作者：仲景
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	reverseL1 := reverseLinkedList(l1)
	reverseL2 := reverseLinkedList(l2)
	reverseSum := addTwoNumber(reverseL1, reverseL2)
	return reverseLinkedList(reverseSum)
}

// 两数相加：LeetCode02
func addTwoNumber(l1 *ListNode, l2 *ListNode) *ListNode {
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

// 翻转链表
func reverseLinkedList(root *ListNode) *ListNode {
	if root == nil {
		return nil
	}

	var pre *ListNode = nil
	var next *ListNode = nil

	for root != nil {
		next = root.Next
		root.Next = pre
		pre = root
		root = next
	}

	return pre
}

// 题解二
// 日期：2023-07-03
// 作者：仲景
func addTwoNumbers2(l1 *ListNode, l2 *ListNode) *ListNode {
	// 定义两个栈
	stack01, stack02 := MyStack{}, MyStack{}

	// 全部入栈
	tmp01, tmp02 := l1, l2
	for tmp01 != nil || tmp02 != nil {
		if tmp01 != nil {
			stack01.Push(tmp01.Val)
			tmp01 = tmp01.Next
		}
		if tmp02 != nil {
			stack02.Push(tmp02.Val)
			tmp02 = tmp02.Next
		}
	}

	newHead := &ListNode{}
	tmp01, tmp02 = l1, l2
	d := 0
	for stack01.Size() != 0 || stack02.Size() != 0 {
		v1, v2 := 0, 0
		if stack01.Size() > 0 {
			v1, _ = stack01.Pop()
		}
		if stack02.Size() > 0 {
			v2, _ = stack02.Pop()
		}
		sum := v1 + v2 + d
		next := newHead.Next
		newHead.Next = &ListNode{Val: sum % 10}
		newHead.Next.Next = next
		d = 0
		if sum >= 10 {
			d = 1
		}
	}

	if d > 0 {
		next := newHead.Next
		newHead.Next = &ListNode{Val: 1}
		newHead.Next.Next = next
	}

	return newHead.Next
}

// MyStack 自定义栈
type MyStack struct {
	elements []int
}

// Push 入栈
func (s *MyStack) Push(element int) {
	// 添加到切片的尾部
	s.elements = append(s.elements, element)
}

// Pop 出栈
func (s *MyStack) Pop() (int, error) {
	if len(s.elements) == 0 {
		return '0', errors.New("栈已空")
	}

	// 获取最后一个元素，也就是栈顶
	top := s.elements[len(s.elements)-1]
	// 移除最后一个元素
	s.elements = s.elements[:len(s.elements)-1]
	return top, nil
}

// Size 获取栈中元素个数
func (s *MyStack) Size() int {
	return len(s.elements)
}
