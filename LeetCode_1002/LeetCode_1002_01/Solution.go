package LeetCode_1002_01

// 1002.查找共用字符
func commonChars(words []string) []string {
	charCounts := make([][26]int, 0)
	// 计算每个字符串的字符出现次数
	for _, word := range words {
		charCounts = append(charCounts, charCount(word))
	}
	res := make([]string, 0)
	// 求每个字符最小的出现次数
	for i := 0; i < 26; i++ {
		minCount := 101

		for j := 0; j < len(words); j++ {
			minCount = min(charCounts[j][i], minCount)
		}

		for ; minCount > 0; minCount-- {
			res = append(res, string('a'+i))
		}
	}
	return res
}

// 计算字符串中每个字符出现的次数
func charCount(str string) (res [26]int) {
	for _, v := range str {
		res[v-'a']++
	}
	return
}
