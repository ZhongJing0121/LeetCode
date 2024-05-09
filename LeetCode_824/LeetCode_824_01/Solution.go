package LeetCode_824_01

import "strings"

// 824.山羊拉丁文
func toGoatLatin(sentence string) string {
	words := strings.Split(sentence, " ")

	charSet := map[byte]bool{
		'A': true,
		'E': true,
		'I': true,
		'O': true,
		'U': true,
		'a': true,
		'e': true,
		'i': true,
		'o': true,
		'u': true,
	}

	for i, word := range words {
		if charSet[word[0]] {
			words[i] += "ma"
		} else {
			words[i] = word[1:] + word[:1] + "ma"
		}
		for j := 0; j <= i; j++ {
			words[i] += "a"
		}
	}

	return strings.Join(words, " ")
}
