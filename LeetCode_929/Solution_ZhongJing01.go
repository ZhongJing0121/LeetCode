package LeetCode_929

import "strings"

// 929.独特的电子邮件地址
// API大法
func numUniqueEmails(emails []string) int {
	emailSet := make(map[string]bool)
	for _, email := range emails {
		i := strings.IndexByte(email, '@')
		prefix := strings.ReplaceAll(strings.SplitN(email[:i], "+", 2)[0], ".", "")
		emailSet[prefix+email[i:]] = true
	}
	return len(emailSet)
}
