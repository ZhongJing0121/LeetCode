package LeetCode_1572_01

// 1572.矩阵对角线元素的和
func diagonalSum(mat [][]int) (res int) {
	m := len(mat)
	if len(mat)%2 != 0 {
		res -= mat[m/2][m/2]
	}

	for i := 0; i < m; i++ {
		res += mat[i][i] + mat[i][m-i-1]
	}

	return
}
