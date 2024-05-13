package LeetCode_100296_01

// 100296.两个字符串的排列差
func findPermutationDifference(s string, t string) (sum int) {
	m := make(map[rune]int)

	for i, v := range s {
		m[v] = i
	}

	for i, v := range t {
		sum += abs(m[v] - i)
	}

	return
}

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}
