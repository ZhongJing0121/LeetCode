package LeetCode_1323

import (
	"math"
)

// 1323. 6 和 9 组成的最大数字
func maximum69Number(num int) int {
	// 和num一致
	res := 0
	// 记录当前的位数
	count := 0
	// 记录翻转的临时结果
	reverseRes := 0

	for num > 0 {
		// 当前是第几位
		cur := num % 10

		// 计算当前应该是1后面多少个0
		d := int(math.Pow10(count))

		// 判断当前数字
		if cur == 6 {
			// 如果当前位是6，还原之前的翻转，并记录翻转为9之后的结果
			reverseRes = d*9 + res
		} else {
			// 如果当前为不是6，继续累加
			reverseRes += d * cur
		}
		// 计算原值，为了方便还原
		res += cur * d

		// 迭代num
		num /= 10
		// 迭代count
		count++
	}

	// 如果有翻转，就是翻转的结果，如果没有翻转，和res一样
	return reverseRes
}
