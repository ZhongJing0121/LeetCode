// Package LeetCode_2586 统计范围内的元音字符串数
package LeetCode_2586

func vowelStrings(words []string, left int, right int) (count int) {
	// 原因音符set
	charSet := map[byte]bool{
		'a': true,
		'e': true,
		'i': true,
		'o': true,
		'u': true,
	}

	for _, word := range words[left : right+1] {
		if charSet[word[0]] && charSet[word[len(word)-1]] {
			count++
		}
	}

	return
}
