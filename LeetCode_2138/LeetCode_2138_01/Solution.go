package LeetCode_2138_01

// 2138.将字符串拆分为若干长度为 k 的组
func divideString(s string, k int, fill byte) []string {
	if diff := len(s) % k; diff != 0 {
		for i := 0; i < k-diff; i++ {
			s += string(fill)
		}
	}

	res := make([]string, 0)
	for left, right := 0, k; right <= len(s); left, right = left+k, right+k {
		res = append(res, s[left:right])
	}

	return res
}
