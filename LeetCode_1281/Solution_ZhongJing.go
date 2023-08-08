package LeetCode_1281

// 题目：LC-1281.整数的各位积和之差
// 日期：2023-08-09
// 作者：仲景
func subtractProductAndSum(n int) int {
	// 这不洒洒水吗？
	mul, sum := 1, 0

	// 遍历数字的各个位置
	for n > 0 {
		mul *= n % 10
		sum += n % 10
		n /= 10
	}

	return mul - sum
}
