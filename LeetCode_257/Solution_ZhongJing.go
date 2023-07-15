package LeetCode_257

import "strconv"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func binaryTreePaths(root *TreeNode) []string {
	res := make([]string, 0)
	process(root, "", &res)
	return res
}

func process(curNode *TreeNode, path string, res *[]string) {
	if curNode != nil {
		pathSB := path
		pathSB += strconv.Itoa(curNode.Val)
		if curNode.Left == nil && curNode.Right == nil {
			*res = append(*res, pathSB)
		} else {
			pathSB += "->"
			process(curNode.Left, pathSB, res)
			process(curNode.Right, pathSB, res)
		}
	}
}
