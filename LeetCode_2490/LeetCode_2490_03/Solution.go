package LeetCode_2490_03

import "strings"

// 2490.回环句
func isCircularSentence(sentence string) bool {
	// 首尾不相等直接返回false
	if sentence[0] != sentence[len(sentence)-1] {
		return false
	}

	// 按空格分割
	split := strings.Split(sentence, " ")

	for i := 1; i < len(split); i++ {
		prev := split[i-1]
		cur := split[i]
		if prev[len(prev)-1] != cur[0] {
			return false
		}
	}
	return true
}
