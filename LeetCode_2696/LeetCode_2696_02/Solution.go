package LeetCode_2696_01

// 2696.删除子串后的字符串最小长度
func minLength(s string) int {
	stack := make([]byte, 0)

	for _, c := range []byte(s) {
		// 如果栈不为空且当前字符和栈顶字符组成AB或者CD，弹出栈顶元素
		if len(stack) != 0 && ((c == 'B' && stack[len(stack)-1] == 'A') || (c == 'D' && stack[len(stack)-1] == 'C')) {
			stack = stack[:len(stack)-1]
		} else {
			stack = append(stack, c)
		}
	}

	return len(stack)
}
