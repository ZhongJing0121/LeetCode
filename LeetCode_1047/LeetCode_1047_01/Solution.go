package LeetCode_1047_01

// 1047.删除字符串中的所有相邻重复项
func removeDuplicates(s string) string {
	stack := make([]byte, 0, len(s))

	for _, c := range s {
		if len(stack) != 0 && stack[len(stack)-1] == byte(c) {
			stack = stack[:len(stack)-1]
		} else {
			stack = append(stack, byte(c))
		}
	}
	return string(stack)
}
