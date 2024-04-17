// Package LeetCode_2341 数组能形成多少数对
package LeetCode_2341

// 使用额外空间一次遍历
func numberOfPairs02(nums []int) []int {
	group, numMap := 0, make(map[int]bool)

	for _, num := range nums {
		if numMap[num] {
			group++
		}
		numMap[num] = !numMap[num]
	}

	return []int{group, len(nums) - group*2}
}
