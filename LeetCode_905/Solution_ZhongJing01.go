// Package LeetCode_905 按奇偶排序数组
package LeetCode_905

func sortArrayByParity(nums []int) []int {
	left, right := 0, len(nums)-1

	for left < right {
		for left < right && nums[left]%2 == 0 {
			left++
		}
		for left < right && nums[right]%2 == 1 {
			right--
		}
		if left < right {
			nums[left], nums[right] = nums[right], nums[left]
			left++
			right--
		}
	}
	return nums
}
