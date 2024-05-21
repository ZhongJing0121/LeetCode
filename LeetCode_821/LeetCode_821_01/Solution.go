package LeetCode_821_01

// 821.字符的最短距离
func shortestToChar(s string, c byte) []int {
	l := len(s)

	res, idx := make([]int, l), -10001
	for i := 0; i < len(s); i++ {
		if s[i] == c {
			idx = i
		}
		res[i] = i - idx
	}

	idx = 10001
	for i := l - 1; i >= 0; i-- {
		if s[i] == c {
			idx = i
		}
		res[i] = min(idx-i, res[i])
	}

	return res
}
