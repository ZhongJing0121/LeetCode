package LeetCode_110_01

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// 110.平衡二叉树
func isBalanced(root *TreeNode) bool {
	return process(root)[0] == 1
}

// 返回该树的深度，[0]表示是否是平衡二叉树，[1]记录深度
func process(node *TreeNode) []int {
	if node == nil {
		return []int{1, 0}
	}

	// 左右子树的深度
	left, right := process(node.Left), process(node.Right)

	// 如果左右子树有不平衡的，或者自己不平衡，直接返回不平衡
	if left[0] == 0 || right[0] == 0 || abs(left[1]-right[1]) > 1 {
		return []int{0, 0}
	}

	return []int{1, max(left[1], right[1]) + 1}
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}
