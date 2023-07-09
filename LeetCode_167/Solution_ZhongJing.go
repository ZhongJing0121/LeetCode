package main

// 题目：167.两数之和 II - 输入有序数组
// 日期：2023-07-08
// 作者：仲景
func twoSum(numbers []int, target int) []int {
	left, right := 0, len(numbers)-1

	for left < right {
		res := numbers[left] + numbers[right]
		if res == target {
			return []int{left + 1, right + 1}
		} else if res > target {
			right--
		} else {
			left++
		}
	}

	return nil
}
