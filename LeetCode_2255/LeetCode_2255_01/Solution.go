package LeetCode_2255_01

import "strings"

// 2255.统计是给定字符串前缀的字符串数目
func countPrefixes(words []string, s string) (res int) {
	preMap := make(map[string]bool)

	preStr := strings.Builder{}
	for _, v := range s {
		preStr.WriteRune(v)
		preMap[preStr.String()] = true
	}

	for _, word := range words {
		if preMap[word] {
			res++
		}
	}
	return
}
