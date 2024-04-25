// Package LeetCode_1769_01
// 移动所有球到每个盒子所需的最小操作数
// 方法一：暴力匹配
package LeetCode_1769_01

func minOperations(boxes string) []int {
	res := make([]int, len(boxes))
	for i, _ := range boxes {
		for j, v2 := range boxes {
			if j == i {
				continue
			}
			curNum := 0
			if v2 == '1' {
				curNum = 1
			}
			res[i] += abs(j-i) * curNum
		}
	}
	return res
}

func abs(num int) int {
	if num < 0 {
		return -num
	}
	return num
}
