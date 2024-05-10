package LeetCode_104_01

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// 104.二叉树的最大深度
func maxDepth(root *TreeNode) int {
	// 如果当前节点为空，返回0
	if root == nil {
		return 0
	}

	// 左右子树的深度
	if left, right := maxDepth(root.Left), maxDepth(root.Right); left > right {
		return left + 1
	} else {
		return right + 1
	}
}
