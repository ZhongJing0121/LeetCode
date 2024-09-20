package LeetCode_1207

// 1207.独一无二的出现次数
func uniqueOccurrences(arr []int) bool {
	numMap := make(map[int]int)

	// 遍历arr
	for _, num := range arr {
		numMap[num]++
	}

	// 判断次数
	countMap := make(map[int]bool)
	for _, v := range numMap {
		if _, exists := countMap[v]; exists {
			return false
		}
		countMap[v] = true
	}

	return true
}
