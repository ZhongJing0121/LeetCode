package LeetCode_492

import "math"

// 492.构造矩形
func constructRectangle(area int) []int {
	// 从中间开始遍历
	num := int(math.Sqrt(float64(area)))
	// 从中间开始遍历，找到第一个能整除的数，这样两个数的差值最小
	for area%num > 0 {
		num--
	}
	return []int{area / int(num), int(num)}
}
