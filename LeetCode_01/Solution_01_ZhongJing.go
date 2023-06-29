package main

/**
作者：仲景
日期：2023-06-29
*/
func twoSum(nums []int, target int) []int {
	m := make(map[int]int)

	for index, num := range nums {
		success := target - num
		if v, exists := m[success]; exists {
			return []int{v, index}
		} else {
			m[num] = index
		}
	}
	return nil
}

