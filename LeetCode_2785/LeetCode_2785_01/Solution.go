package LeetCode_2785_01

import (
	"sort"
	"strings"
)

// 2785.将字符串中的元音字母排序
func sortVowels(s string) string {
	// 记录所有的原因字符
	vowelCharacters := make([]rune, 0)
	for _, c := range s {
		if strings.Contains("aeiouAEIOU", string(c)) {
			vowelCharacters = append(vowelCharacters, c)
		}
	}
	// 给元音字符排序
	sort.Slice(vowelCharacters, func(i, j int) bool {
		return vowelCharacters[i] < vowelCharacters[j]
	})

	res := []rune(s)

	for i, j := 0, 0; i < len(res); i++ {
		if strings.Contains("aeiouAEIOU", string(res[i])) {
			res[i] = vowelCharacters[j]
			j++
		}
	}

	return string(res)
}
