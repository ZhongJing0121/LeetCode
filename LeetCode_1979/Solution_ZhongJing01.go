// Package LeetCode_1979 找出数组的最大公约数
package LeetCode_1979

func findGCD(nums []int) int {
	minNum, maxNum := 1001, 0
	for _, num := range nums {
		if num < minNum {
			minNum = num
		}

		if num > maxNum {
			maxNum = num
		}
	}
	return gcd(minNum, maxNum)
}

// 辗转相除求最大公约数
func gcd(a, b int) int {
	for a != 0 {
		a, b = b%a, a
	}
	return b
}
