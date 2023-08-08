package LeetCode_1749

// 题目：1749. 任意子数组和的绝对值的最大值
// 日期：2023-08-08
// 作者：仲景
func maxAbsoluteSum(nums []int) (ans int) {
	var fMax, fMin int
	for _, x := range nums {
		// 如果加当前数变大，记录最大值
		fMax = max(fMax, 0) + x
		// 如果加当前数变小，记录最小值
		fMin = min(fMin, 0) + x
		// 求加上当前数之后最大最小值和之前子数组历史最大值的最大值
		ans = max(ans, max(fMax, -fMin))
	}
	return
}

func min(a, b int) int {
	if b < a {
		return b
	}
	return a
}
func max(a, b int) int {
	if b > a {
		return b
	}
	return a
}
