package LeetCode_28

import "fmt"

// 日期：2023-08-07
// 作者：仲景
func strStr(haystack string, needle string) int {
	if len(haystack) == 0 || len(needle) == 0 {
		return -1
	}

	x, y := 0, 0

	nextArr := next(needle)
	for x < len(haystack) && y < len(needle) {
		if haystack[x] == needle[y] {
			x++
			y++
		} else if (*nextArr)[y] == -1 {
			x++
		} else {
			y = (*nextArr)[y]
		}
	}
	if y == len(needle) {
		return x - y
	}
	return -1
}

func next(s string) *[]int {
	// 如果长度只有1，直接返回-1
	if len(s) == 1 {
		return &[]int{-1}
	}

	// 创建next数组并舒适化
	nextArr := make([]int, len(s))
	nextArr[0] = -1
	nextArr[1] = 0

	i, preIndex := 2, 0

	fmt.Printf("nextArr.len = %v", len(nextArr))
	for i < len(nextArr) {
		if s[i-1] == s[preIndex] {
			preIndex += 1
			nextArr[i] = preIndex
			i += 1
		} else if preIndex > 0 {
			preIndex = nextArr[preIndex]
		} else {
			nextArr[i] = 0
			i += 1
		}
	}

	return &nextArr
}
