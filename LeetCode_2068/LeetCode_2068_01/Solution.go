package LeetCode_2068_01

// 2068.检查两个字符串是否几乎相等
func checkAlmostEquivalent(word1 string, word2 string) bool {
	m := make([]int, 26)

	// 遍历word1记录每个字符出现的次数
	for _, r := range word1 {
		m[r-'a']++
	}

	// 遍历word2
	for _, r := range word2 {
		m[r-'a']--
	}

	// 遍历hash表，看看是否有超过3的差值
	for i := 0; i < 26; i++ {
		if m[i] > 3 || m[i] < -3 {
			return false
		}
	}
	return true
}
