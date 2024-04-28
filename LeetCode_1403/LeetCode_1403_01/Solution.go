package LeetCode_1403_01

import "sort"

// 1403.非递增顺序的最小子序列
func minSubsequence(nums []int) []int {
	numsSum := 0
	for _, num := range nums {
		numsSum += num
	}

	// 排序
	sort.Slice(nums, func(i, j int) bool {
		return nums[i] > nums[j]
	})
	for i, sum := 0, 0; ; i++ {
		sum += nums[i]
		if sum > numsSum-sum {
			return nums[:i+1]
		}
	}
}
