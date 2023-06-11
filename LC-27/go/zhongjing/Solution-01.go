package main

/**
作者：Zhongjing
时间：2023-06-11
*/
func removeElement(nums []int, val int) int {

	len := len(nums)

	left, right := 0, len-1

	for left <= right {
		if nums[left] == val {
			nums[left] = nums[right]
			right--
		} else {
			left++
			right--
		}
	}

	return left + 1
}
