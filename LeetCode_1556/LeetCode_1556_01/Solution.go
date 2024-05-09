package LeetCode_1556_01

import (
	"strconv"
	"strings"
)

// 1556.千位分隔数
func thousandSeparator(n int) string {
	if n == 0 {
		return "0"
	}
	sb := strings.Builder{}
	for count := 1; n > 0; n, count = n/10, count+1 {
		if count == 4 {
			sb.WriteByte('.')
			count = 1
		}
		sb.WriteString(strconv.Itoa(n % 10))
	}
	return reverseString(sb.String())
}

func reverseString(s string) string {
	strs := []rune(s)

	for left, right := 0, len(strs)-1; left < right; left, right = left+1, right-1 {
		strs[left], strs[right] = strs[right], strs[left]
	}

	return string(strs)
}
