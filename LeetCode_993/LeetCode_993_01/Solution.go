package LeetCode_993_01

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// 993.二叉树的堂兄弟节点
func isCousins(root *TreeNode, x int, y int) bool {
	if x == 0 || y == 0 {
		return false
	}
	// 目标层级，目标父节点
	targetLevel, targetFather := 0, &TreeNode{}
	var process func(node, fa *TreeNode, level int) bool
	process = func(node, fa *TreeNode, level int) bool {
		// 遍历完或者层级高于找到的数字的层级，直接返回false
		if node == nil || targetLevel > 0 && level > targetLevel {
			return false
		}

		// 找到其中一个
		if node.Val == x || node.Val == y {
			// 如果之前已经找到了
			if targetLevel > 0 {
				return targetLevel == level && fa == targetFather
			}
			// 之前没记录，记录本地的层级和父节点
			targetLevel, targetFather = level, fa
		}
		return process(node.Left, node, level+1) || process(node.Right, node, level+1)
	}
	return process(root, nil, 1)
}
