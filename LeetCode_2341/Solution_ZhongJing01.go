// Package LeetCode_2341 数组能形成多少数对
package LeetCode_2341

import (
	"sort"
)

// 排序然后两两比较
func numberOfPairs(nums []int) []int {
	// 特殊情况
	if len(nums) < 2 {
		return []int{0, 1}
	}

	// 对nums排序，时间复杂度O(logN)
	sort.Ints(nums)

	// 记录相同的组
	group := 0

	// 最好时间复杂度O(logN)，最坏退化到O(N)
	for left, right := 0, 1; right < len(nums); {
		if nums[left] == nums[right] {
			group++
			left, right = right+1, right+2
		} else {
			left, right = right, right+1
		}
	}

	return []int{group, len(nums) - group*2}
}
