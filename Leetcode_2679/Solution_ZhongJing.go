package Leetcode_2679

import (
	"math"
	"sort"
)

// 日期：2023-07-04
// 作者：仲景
func matrixSum(nums [][]int) int {
	numsLen := len(nums)
	numLen := len(nums[0]) - 1

	// 遍历nums，排序每一行的数组
	for i := 0; i < numsLen; i++ {
		sort.Ints(nums[i])
	}

	res := 0
	for i := numLen; i >= 0; i-- {
		maxNum := math.MinInt
		for j := 0; j < numsLen; j++ {
			maxNum = max(maxNum, nums[j][i])
		}
		res += maxNum
	}

	return res
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
