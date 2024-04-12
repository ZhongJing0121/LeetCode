package LeetCode_2169

// 2169.得到0的操作数
func countOperations(num1 int, num2 int) int {
	count := 0
	for num1 > 0 {
		count += (num2 / num1)
		num1, num2 = num2%num1, num1
	}
	return count
}
