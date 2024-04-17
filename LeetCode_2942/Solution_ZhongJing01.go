// Package LeetCode_2942 查找包含给定字符的单词
package LeetCode_2942

func findWordsContaining(words []string, x byte) []int {
	res := make([]int, 0)
	for i, word := range words {
		if checkCharInString(word, x) {
			res = append(res, i)
		}
	}
	return res
}

// 检查字符是否存在于字符串中
// true->存在，false->不存在
func checkCharInString(s string, x byte) bool {
	for _, b := range s {
		if byte(b) == x {
			return true
		}
	}
	return false
}
