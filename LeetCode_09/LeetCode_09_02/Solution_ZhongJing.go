package main

// 作者：仲景
// 日期：2023-06-30
func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}

	num := x
	res := 0

	for num > 0 {
		res *= 10
		res += num % 10
		num /= 10
	}

	return res == x
}
