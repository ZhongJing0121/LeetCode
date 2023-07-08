package main

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
