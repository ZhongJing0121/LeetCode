package LeetCode_1624_01

// 1624.两个相同字符之间的最长子字符串
func maxLengthBetweenEqualCharacters(s string) (res int) {
	m := make(map[int]int)

	// 遍历s
	maxLen := -1
	for i, c := range s {
		if v, ok := m[int(c-'a')]; ok {
			maxLen = max(maxLen, i-v-1)
		} else {
			m[int(c-'a')] = i
		}
	}

	return maxLen
}
