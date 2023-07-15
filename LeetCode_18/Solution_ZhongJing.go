package LeetCode_18

import "sort"

// 题目：18. 四数之和
// 日期：2023-07-15
// 作者：仲景
func fourSum(nums []int, target int) [][]int {
	n := len(nums)
	if n < 4 {
		return nil
	}
	// 给nums排序
	sort.Ints(nums)
	res := make([][]int, 0)
	for i := 0; i < n-3; i++ {
		// 对i去重
		if i > 0 && nums[i-1] == nums[i] {
			continue
		}
		// 如果当前最小的组合都大于target，说明不存在解
		if nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target {
			break
		}
		// 如果当前最大的组合都小于target，说明当前数字不存在解
		if nums[i]+nums[n-3]+nums[n-2]+nums[n-1] < target {
			continue
		}
		for j := i + 1; j < n-2; j++ {
			// 对j去重
			if j > i+1 && nums[j-1] == nums[j] {
				continue
			}
			// 如果当前最小的组合都大于target，说明不存在解
			if nums[i]+nums[j]+nums[j+1]+nums[j+2] > target {
				break
			}
			// 如果当前最大的组合都小于target，说明当前数字不存在解
			if nums[i]+nums[j]+nums[n-2]+nums[n-1] < target {
				continue
			}
			left, right := j+1, n-1
			for left < right {
				curSum := nums[i] + nums[j] + nums[left] + nums[right]
				if curSum == target {
					// 记录结果
					res = append(res, []int{nums[i], nums[j], nums[left], nums[right]})
					left++
					right--
					// 对left和right去重
					for left < right && nums[left-1] == nums[left] {
						left++
					}
					for left < right && nums[right+1] == nums[right] {
						right--
					}
				} else if curSum > target {
					// 数字太大了，需要变小
					right--
				} else {
					// 数字太小了，需要变大
					left++
				}
			}
		}
	}

	return res
}
