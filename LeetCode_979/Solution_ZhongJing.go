package LeetCode_979

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}
type NodeInfo struct {
	// 所有的节点个数（也就是需要的金币数量）
	allNode int
	// 所有的金币（也就是真正的金币数量，缺了或者多了）
	allMoney int
}

func distributeCoins(root *TreeNode) int {
	var res int = 0
	process(root, &res)
	return res
}

func process(root *TreeNode, res *int) *NodeInfo {
	// base case
	if root == nil {
		return &NodeInfo{
			allNode:  0,
			allMoney: 0,
		}
	}

	// 计算左右儿子信息
	leftInfo := process(root.Left, res)
	rightInfo := process(root.Right, res)
	// 计算当前节点信息
	curInfo := &NodeInfo{
		allNode:  leftInfo.allNode + rightInfo.allNode + 1,
		allMoney: leftInfo.allMoney + rightInfo.allMoney + root.Val,
	}
	// 当前节点需要拿出多少个币（出多少就得走多少步）
	*res += abs(curInfo.allMoney - curInfo.allNode)
	return curInfo
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}
