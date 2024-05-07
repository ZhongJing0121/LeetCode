package LeetCode_1078_01

import "strings"

// 1078.Bigram 分词
func findOcurrences(text string, first string, second string) []string {
	// 切割句子
	spText, res := strings.Split(text, " "), make([]string, 0)

	for i := 1; i < len(spText)-1; i++ {
		if spText[i] == second && spText[i-1] == first {
			res = append(res, spText[i+1])
		}
	}

	return res
}
