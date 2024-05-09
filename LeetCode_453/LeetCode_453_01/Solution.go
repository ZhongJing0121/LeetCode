package LeetCode_453_01

import "slices"

// 453.最小操作次数使数组元素相等
func minMoves(nums []int) (res int) {
	minNum := slices.Min(nums)
	for _, num := range nums {
		res += num - minNum
	}
	return
}
