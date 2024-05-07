package LeetCode_1317_01

// 1317.将整数转换为两个无零整数的和
func getNoZeroIntegers(n int) []int {
	for i := 1; i < n/2+1; i++ {
		if noZero(i) && noZero(n-i) {
			return []int{i, n - i}
		}
	}
	return []int{}
}

// 判断有没有0
func noZero(n int) bool {
	for n > 0 {
		if n%10 == 0 {
			return false
		}
		n /= 10
	}
	return true
}
