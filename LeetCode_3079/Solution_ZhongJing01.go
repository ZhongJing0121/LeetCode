// Package LeetCode_3079 求出加密整数的和
package LeetCode_3079

import "math"

func sumOfEncryptedInt(nums []int) int {
	res := 0
	for _, num := range nums {
		res += getMaxBit(num)
	}
	return res
}

// 获取数字中最大的一位数，返回形成的最大值
func getMaxBit(num int) int {
	maxNum := -1
	count := 0
	var curNum int

	for num > 0 {
		curNum = num % 10
		if curNum > maxNum {
			maxNum = curNum
		}
		num /= 10
		count++
	}

	res := 0
	for i := range count {
		res += maxNum * int(math.Pow10(i))
	}

	return res
}
