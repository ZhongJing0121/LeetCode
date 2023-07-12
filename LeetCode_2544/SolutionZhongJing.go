package LeetCode_2544

// 日期：2023-07-12
// 作者：仲景
func alternateDigitSum(n int) int {
	// 长度是奇数，最后1位是正
	// 长度是偶数，最后1位是负
	// 计算数字的长度
	l := 0
	num := n
	for num > 0 {
		l++
		num /= 10
	}
	flag := 1
	if l%2 == 0 {
		flag = -1
	}
	res := 0
	for n > 0 {
		// 取出最后一位
		cur := n % 10
		res += cur * flag
		n /= 10
		flag = -flag
	}

	return res
}
