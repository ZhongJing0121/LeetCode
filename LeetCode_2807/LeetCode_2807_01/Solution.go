package LeetCode_2807_01

// ListNode 链表
type ListNode struct {
	Val  int
	Next *ListNode
}

// 2807.在链表中插入最大公约数
func insertGreatestCommonDivisors(head *ListNode) *ListNode {
	for node := head; node.Next != nil; node = node.Next.Next {
		node.Next = &ListNode{
			Val:  gcd(node.Val, node.Next.Val),
			Next: node.Next,
		}
	}
	return head
}

func gcd(a, b int) int {
	for b != 0 {
		a, b = b, a%b
	}
	return a
}
