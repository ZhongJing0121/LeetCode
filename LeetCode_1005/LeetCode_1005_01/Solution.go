package LeetCode_1005_01

import "sort"

// 1005.K 次取反后最大化的数组和
func largestSumAfterKNegations(nums []int, k int) (sum int) {
	for i := 0; i < k; i++ {
		sort.Ints(nums)
		// 每次都变最小的
		nums[0] = -nums[0]
	}

	for _, num := range nums {
		sum += num
	}
	return
}
