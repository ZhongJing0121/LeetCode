package LeetCode_1528

// 1528.重新排列字符串
func restoreString(s string, indices []int) string {
	res := make([]byte, len(s))

	for i, c := range s {
		res[indices[i]] = byte(c)
	}

	return string(res)
}
