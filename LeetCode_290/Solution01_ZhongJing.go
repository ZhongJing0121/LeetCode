package LeetCode_290

import "strings"

func wordPattern(pattern string, s string) bool {
	patternCharToStringMap := make(map[rune]string)
	subStrs := strings.Split(s, " ")
	for _, r := range pattern {
		if v, exists := patternCharToStringMap[r]; exists {

		} else {
			patternCharToStringMap[r] = v
		}
	}
}
