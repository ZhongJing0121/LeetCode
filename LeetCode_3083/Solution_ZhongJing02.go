// Package LeetCode_3083 字符串及其反转中是否存在同一子字符串
// 题解二：使用bitmap保存两个字符是否出现过，一次遍历
package LeetCode_3083

func isSubstringPresent2(s string) bool {
	m := make([]int, 26)

	for i := 1; i < len(s); i++ {
		x := int(s[i-1] - 'a')
		y := int(s[i] - 'a')

		m[x] |= 1 << y

		if m[y]>>x&1 != 0 {
			return true
		}
	}
	return false
}
