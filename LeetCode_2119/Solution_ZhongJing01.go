// Package LeetCode_2119 反转两次的数字
package LeetCode_2119

func isSameAfterReversals(num int) bool {
	return num == reverseNum(reverseNum(num))
}

// 反转数字
func reverseNum(num int) (res int) {
	for curBit := num % 10; curBit == 0 && num > 0; curBit = num % 10 {
		num /= 10
	}
	for num > 0 {
		res = res*10 + num%10
		num /= 10
	}

	return res
}
