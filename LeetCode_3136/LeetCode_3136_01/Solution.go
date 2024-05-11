package LeetCode_3136_01

// 3136.有效单词
func isValid(word string) bool {
	if len(word) < 3 {
		return false
	}

	vowel := map[rune]bool{
		'a': true,
		'e': true,
		'i': true,
		'o': true,
		'u': true,
		'A': true,
		'E': true,
		'I': true,
		'O': true,
		'U': true,
	}
	haveVowel, haveNotVowel := false, false
	for _, v := range word {
		if v >= 'a' && v <= 'z' || v >= 'A' && v <= 'Z' {
			// 如果是字母
			if vowel[v] {
				haveVowel = true
			} else {
				haveNotVowel = true
			}
		} else if v <= '0' || v >= '9' {
			// 不是字母，数字不需要处理，不是数字直接return false
			return false
		}
	}
	return haveVowel && haveNotVowel
}
