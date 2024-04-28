package LeetCode_872_01

import "slices"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// 872.叶子相似的树
func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
	leafs1, leafs2 := make([]int, 0), make([]int, 0)

	process(root1, &leafs1)
	process(root2, &leafs2)

	// 如果长度都不一样，不需要比
	if len(leafs1) != len(leafs2) {
		return false
	}

	// 长度一样，按索引比较两个数组
	return slices.Equal(leafs1, leafs2)
}

// 查找二叉树的叶子节点序列
// 顺序从左到右
func process(root *TreeNode, leafs *[]int) {
	if root == nil {
		return
	}

	if root.Left == nil && root.Right == nil {
		*leafs = append(*leafs, root.Val)
	}

	process(root.Left, leafs)
	process(root.Right, leafs)
}
