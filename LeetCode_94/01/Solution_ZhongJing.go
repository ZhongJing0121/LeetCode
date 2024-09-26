package LeetCode_94

// 日期：2023-07-12
// 作者：仲景
type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func inorderTraversal(root *TreeNode) []int {
	// 保存遍历的顺序
	res := make([]int, 0)
	process(root, &res)

	return res
}

func process(root *TreeNode, res *[]int) {
	if root == nil {
		return
	}

	process(root.Left, res)
	*res = append(*res, root.Val)
	process(root.Right, res)
}
