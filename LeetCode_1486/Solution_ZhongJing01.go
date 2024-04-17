// Package LeetCode_1486 数组异或操作
package LeetCode_1486

func xorOperation(n int, start int) int {
	res := 0
	for i := range n {
		res ^= 2*i + start
	}
	return res
}
