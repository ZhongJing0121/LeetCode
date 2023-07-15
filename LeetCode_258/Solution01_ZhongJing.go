package LeetCode_258

// 题目：258. 各位相加
// 日期：2023-07-15
// 作者：仲景
func addDigits(num int) int {
	for num > 9 {
		cur := 0
		for num > 0 {
			cur += num % 10
			num /= 10
		}
		num = cur
	}

	return num
}
