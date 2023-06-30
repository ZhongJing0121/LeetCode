package main

import "strings"

/**
作者：仲景
日期：2023-06-30
*/
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

func isCircularSentence02(sentence string) bool {
	sLen := len(sentence)

	if sentence[0] != sentence[sLen-1] {
		return false
	}

	for i := 0; i < sLen; i++ {
		if sentence[i] == ' ' && sentence[i+1] != sentence[i-1] {
			return false
		}
	}
	return true
}
