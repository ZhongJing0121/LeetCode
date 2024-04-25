package main

// 日期：2023-07-1769_01
// 作者：仲景
func longestCommonPrefix(strs []string) string {
	prefix := strs[0]
	for i := 1; i < len(strs); i++ {
		prefix = twoStrCommonPrefix(strs[i], prefix)
	}

	return prefix
}

// 求两个字符串的公共前缀
func twoStrCommonPrefix(s1, s2 string) string {
	s1Len, s2Len := len(s1), len(s2)
	if s1Len == 0 || s2Len == 0 {
		return ""
	}

	prefix := ""
	for i := 0; i < s1Len && i < s2Len; i++ {
		if s1[i] != s2[i] {
			break
		}
		prefix += string(s1[i])
	}

	return prefix
}
