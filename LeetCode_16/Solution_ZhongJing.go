package LeetCode_16

import (
	"math"
	"sort"
)

// 题目：16.最接近的三数之和
// 日期：2023-07-10
// 作者：仲景
func threeSumClosest(nums []int, target int) int {
	numsLen := len(nums)
	sort.Ints(nums)
	min := math.MaxInt
	res := 0
	for i := 0; i < numsLen-2; i++ {
		left, right := i+1, numsLen-1
		for left < right {
			cur := nums[i] + nums[left] + nums[right]
			if cur == target {
				return target
			}

			if cur > target {
				if cur-target < min {
					min = cur - target
					res = cur
				}
				right--
			} else {
				if target-cur < min {
					min = target - cur
					res = cur
				}
				left++
			}
		}
	}
	return res
}
