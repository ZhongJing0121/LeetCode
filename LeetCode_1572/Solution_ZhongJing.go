package LeetCode_1572

// 题目：1572.矩阵对角线元素的和
// 日期：2023-08-11
// 作者：仲景
func diagonalSum(mat [][]int) int {
	x1, y1 := 0, 0
	x2, y2 := 0, len(mat[0])-1
	lenX, lenY := len(mat), len(mat[0])

	res := 0

	for x1 < lenX && x2 >= 0 && y1 < lenY && y2 >= 0 {
		// 特殊情况会指向同一个下标
		if x1 == x2 && y1 == y2 {
			res += mat[x1][y1]
		} else {
			res += mat[x1][y1] + mat[x2][y2]
		}
		x1++
		y1++
		x2++
		y2--
	}

	return res
}
