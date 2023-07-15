package LeetCode_268

// 题目：268. 丢失的数字
// 日期：2023-07-15
// 作者：仲景
func missingNumber02(nums []int) int {
	n := len(nums)
	res := 0
	for i := 0; i <= n; i++ {
		res ^= i
	}
	for _, num := range nums {
		res ^= num
	}

	return res
}
