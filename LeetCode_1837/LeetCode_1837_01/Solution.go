package LeetCode_1837_01

// 1837.K 进制表示下的各位数字总和
func sumBase(n int, k int) (res int) {
	for n > 0 {
		res += n % k
		n /= k
	}

	return
}
