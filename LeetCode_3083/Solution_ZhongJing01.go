// Package LeetCode_3083 字符串及其反转中是否存在同一子字符串
// 题解一：反转字符串后，滑动固定窗口依次比较
package LeetCode_3083

import (
	"strings"
)

func isSubstringPresent(s string) bool {
	reverseS := reverseWords(s)

	for i := 0; i < len(reverseS)-1; i++ {
		if strings.Contains(reverseS, s[i:i+2]) {
			return true
		}
	}
	return false
}

func reverseWords(s string) string {
	bytes := []byte(s)

	for left, right := 0, len(bytes)-1; left < right; left, right = left+1, right-1 {
		bytes[left], bytes[right] = bytes[right], bytes[left]
	}

	return string(bytes)
}
