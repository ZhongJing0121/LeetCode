package LeetCode_931

import (
	"math"
)

// 日期：2023-07-13
// 作者：仲景
func minFallingPathSum(matrix [][]int) int {
	rowLen := len(matrix)
	colLen := len(matrix[0])

	dp := make([][]int, rowLen)
	for i := 0; i < rowLen; i++ {
		dp[i] = make([]int, colLen)
	}

	copy(dp[0], matrix[0])

	for i := 1; i < rowLen; i++ {
		for j := 0; j < colLen; j++ {
			if j == 0 {
				dp[i][j] = matrix[i][j] + min(dp[i-1][j], dp[i-1][j+1])
			} else if j == colLen-1 {
				dp[i][j] = matrix[i][j] + min(dp[i-1][j], dp[i-1][j-1])
			} else {
				dp[i][j] = matrix[i][j] + min(min(dp[i-1][j-1], dp[i-1][j]), dp[i-1][j+1])
			}
		}
	}

	res := math.MaxInt
	for i := 0; i < colLen; i++ {
		res = min(dp[rowLen-1][i], res)
	}

	return res
}

func min(a, b int) int {
	if b < a {
		return b
	}
	return a
}
