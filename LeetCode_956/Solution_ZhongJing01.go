// Package LeetCode_956 单值二叉树
package LeetCode_956

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isUnivalTree(root *TreeNode) bool {
	if root == nil {
		return true
	}
	return process(root, root.Val)
}

func process(root *TreeNode, val int) bool {
	if root == nil {
		return true
	}
	return root.Val == val && process(root.Left, val) && process(root.Right, val)
}
