package LeetCode_2839_01

// 2839.判断通过操作能否让字符串相等 I
func canBeEqual(s1 string, s2 string) bool {
	var countMap, countMap2 [2][26]int

	for i, v := range s1 {
		countMap[i%2][v-'a']++
		countMap2[i%2][s2[i]-'a']++
	}

	return countMap == countMap2
}
