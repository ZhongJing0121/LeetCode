package LeetCode_124_01

import (
	"math"
)

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// 124.二叉树中的最大路径和
func maxPathSum(root *TreeNode) int {
	res := math.MinInt

	var process func(node *TreeNode) int
	process = func(node *TreeNode) int {
		if node == nil {
			return 0
		}

		left := process(node.Left)
		right := process(node.Right)

		res = max(res, left+right+node.Val)

		return max(max(left, right)+node.Val, 0)
	}

	process(root)
	return res
}
