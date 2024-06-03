package LeetCode_1305_01

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// 1305.两棵二叉搜索树中的所有元素
func getAllElements(root1 *TreeNode, root2 *TreeNode) []int {
	// 中序遍历两棵二叉树得到有序序列
	root1List, root2List := make([]int, 0), make([]int, 0)
	inorderTraversal(root1, &root1List)
	inorderTraversal(root2, &root2List)

	// 合并两个有序序列
	return mergeSortedList(&root1List, &root2List)
}

// 中序遍历二叉树
func inorderTraversal(node *TreeNode, inorderList *[]int) {
	if node == nil {
		return
	}
	if node.Left != nil {
		inorderTraversal(node.Left, inorderList)
	}
	*inorderList = append(*(inorderList), node.Val)
	if node.Right != nil {
		inorderTraversal(node.Right, inorderList)
	}
}

// 合并两个有序序列，按正序排序
func mergeSortedList(list1, list2 *[]int) []int {
	i, j, l1, l2 := 0, 0, *list1, *list2
	len1, len2 := len(l1), len(l2)

	res := make([]int, 0, len(*list1)+len(*list2))
	for i < len1 && j < len2 {
		if l1[i] < l2[j] {
			res = append(res, l1[i])
			i++
		} else {
			res = append(res, l2[j])
			j++
		}
	}

	for i < len1 {
		res = append(res, l1[i])
		i++
	}

	for j < len2 {
		res = append(res, l2[j])
		j++
	}

	return res
}
