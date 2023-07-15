package LeetCode_268

import "sort"

// 题目：268. 丢失的数字
// 日期：2023-07-15
// 作者：仲景
func missingNumber(nums []int) int {
	n := len(nums)
	// 给nums排序
	sort.Ints(nums)

	for i := 0; i < n; i++ {
		if nums[i] != i {
			return i
		}
	}

	return n
}
