package LeetCode_1791_01

// 1791.找出星型图的中心节点
func findCenter(edges [][]int) int {
	/*
		因为结果必然存在，所以找出二维数组中前两个里共有的数字就行
	*/
	if edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] {
		return edges[0][0]
	}
	if edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1] {
		return edges[0][1]
	}
	return -1
}
