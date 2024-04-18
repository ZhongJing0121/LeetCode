// Package LeetCode_3019 按键变更的次数
package LeetCode_3019

func countKeyChanges(s string) (count int) {
	preAsc := s[0]
	for _, ch := range s[1:] {
		if !equals(preAsc, byte(ch)) {
			count++
		}
		preAsc = byte(ch)
	}
	return
}

func equals(a, b byte) bool {
	if a >= 'a' && a <= 'z' {
		a -= 32
	}
	if b >= 'a' && b <= 'z' {
		b -= 32
	}
	return a == b
}
