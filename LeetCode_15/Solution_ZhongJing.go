package LeetCode_15

import "sort"

// 题目：15.三数之和
// 日期：2023-07-09
// 作者：仲景
func threeSum(nums []int) [][]int {
	res := make([][]int, 0)
	l := len(nums)
	sort.Ints(nums)
	for i := 0; i < l; {
		left, right := i+1, l-1
		for left < right {
			cur := nums[left] + nums[right] + nums[i]
			if cur == 0 {
				res = append(res, []int{nums[i], nums[left], nums[right]})
				left, right = left+1, right-1
				// 对left和right去重
				for left < right && nums[left-1] == nums[left] {
					left++
				}
				for left < right && nums[right+1] == nums[right] {
					right--
				}
			} else if cur > 0 {
				right--
			} else {
				left++
			}
		}
		i++

		for i < l && nums[i-1] == nums[i] {
			i++
		}
	}
	return res
}
