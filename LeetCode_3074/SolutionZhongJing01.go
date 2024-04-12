package LeetCode_3074

import "sort"

// 3074.重新分装苹果
func minimumBoxes(apple []int, capacity []int) int {
	res := 0

	// 算一共多少个苹果
	allApple := 0
	for _, count := range apple {
		allApple += count
	}

	// 对箱子排序
	sort.Slice(capacity, func(i, j int) bool {
		return capacity[i] > capacity[j]
	})

	// 遍历箱子
	for _, count := range capacity {
		if allApple <= 0 {
			break
		}
		allApple -= count
		res += 1
	}
	return res
}
