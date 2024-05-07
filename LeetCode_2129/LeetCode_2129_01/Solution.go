package LeetCode_2129_01

import (
	"strings"
)

// 2129.将标题首字母大写
func capitalizeTitle(title string) string {
	a := strings.Split(title, " ")
	for i, s := range a {
		s = strings.ToLower(s)
		if len(s) > 2 {
			s = strings.ToUpper(s[0:1]) + s[1:]
		}
		a[i] = s
	}
	return strings.Join(a, " ")
}
