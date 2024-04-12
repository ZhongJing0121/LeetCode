package LeetCode_929

import "strings"

// 929.独特的电子邮件地址
// 一次遍历全替换
func numUniqueEmails2(emails []string) int {
	emailSet := make(map[string]bool)
	for _, email := range emails {
		// 获取@的索引
		i := strings.IndexByte(email, '@')
		prefix := email[:i]
		suffix := email[i:]
		var s []rune
		// 遍历前缀
		for _, ch := range prefix {
			if ch == '.' {
				continue
			} else if ch == '+' {
				break
			} else {
				s = append(s, ch)
			}
		}
		emailSet[string(s)+suffix] = true
	}
	return len(emailSet)
}
