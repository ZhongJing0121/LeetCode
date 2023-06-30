package main

import "strings"

func isCircularSentence(sentence string) bool {
	sLen := len(sentence)
	if sentence[0] != sentence[sLen-1] {
		return false
	}

	// 按空格切割
	arr := strings.Split(sentence, " ")

	arrLen := len(arr)
	preEnd := uint8(' ')
	for i := 0; i < arrLen; i++ {
		if preEnd != ' ' && preEnd != arr[i][0] {
			return false
		}
		preEnd = arr[i][len(arr[i])-1]
	}

	return true
}
