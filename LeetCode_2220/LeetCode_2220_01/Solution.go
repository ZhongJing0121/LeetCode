package LeetCode_2220_01

// 2220.转换数字的最少位翻转次数
func minBitFlips(start int, goal int) (res int) {
	tmp := start ^ goal
	for tmp != 0 {
		res += tmp & 1
		tmp >>= 1
	}
	return
}
