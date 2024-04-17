// Package LeetCode_2974 最小数字游戏
package LeetCode_2974

import "sort"

func numberGame(nums []int) []int {
	// 对数组排序
	sort.Ints(nums)

	for i := 1; i < len(nums); i += 2 {
		nums[i], nums[i-1] = nums[i-1], nums[i]
	}

	return nums
}
