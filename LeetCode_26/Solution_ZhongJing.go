package main

// 日期：2023-07-1769_01
// 作者：仲景
func removeDuplicates(nums []int) int {
	index, numsLen := 1, len(nums)
	if numsLen == 0 {
		return 0
	}
	for i := 1; i < len(nums); i++ {
		if nums[i] != nums[i-1] {
			nums[index] = nums[i]
			index++
		}
	}
	return index
}
