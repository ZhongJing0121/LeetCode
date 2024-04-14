package main

// 1437.是否所有 1 都至少相隔 k 个元素
func kLengthApart(nums []int, k int) bool {
	var preIndex int = -1

	// 遍历数组
	for i, v := range nums {
		// 如果不是1，直接跳过
		if v != 1 {
			continue
		}
		// 如果之前没有1，记录当前1的位置后直接跳过
		if preIndex == -1 {
			preIndex = i
			continue
		}
		// 如果当前1和之前1的距离小于k，直接返回false
		if i-preIndex-1 < k {
			return false
		}
		// 迭代当前1的索引
		preIndex = i
	}

	// 没有返回false，就说明都符合要求
	return true
}
