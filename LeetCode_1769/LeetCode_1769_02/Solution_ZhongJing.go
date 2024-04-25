// Package LeetCode_1769_01
// 移动所有球到每个盒子所需的最小操作数
// 方法二：类似DP，从前一个盒子的操作数推导后一个盒子的操作数
package LeetCode_1769_01

func minOperations(boxes string) []int {
	res, leftCount, rightCount := make([]int, len(boxes)), 0, 0
	// 初始化0索引盒子
	if boxes[0] == '1' {
		leftCount++
	}
	// 计算0索引盒子的操作数
	for i := 1; i < len(boxes); i++ {
		if boxes[i] == '1' {
			res[0] += i
			rightCount++
		}
	}

	for i := 1; i < len(boxes); i++ {
		res[i] = res[i-1] + leftCount - rightCount
		if boxes[i] == '1' {
			leftCount++
			rightCount--
		}
	}

	return res
}
