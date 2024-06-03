package LeetCode_2520_01

// 2520.统计能整除数字的位数
func countDigits(num int) (res int) {
	n := num
	for n > 0 {
		curBitNum := n % 10

		if num%curBitNum == 0 {
			res++
		}

		n /= 10
	}
	return
}
