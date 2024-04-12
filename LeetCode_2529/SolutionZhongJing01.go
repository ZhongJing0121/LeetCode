package LeetCode_2529

// 2529.正整数和负整数的最大计数
func solutionZhongJing01(nums []int) int {
	pos, neg := 0, 0

	for _, num := range nums {
		if num > 0 {
			pos++
		} else if num < 0 {
			neg++
		}
	}

	return max(pos, neg)
}
