package LeetCode_670

import "strconv"

func maximumSwap(num int) int {
	// 数字转字符串
	s := strconv.Itoa(num)

	// 记录 从右往左 最大的数字坐标
	maxIndex := len(s) - 1

	// 记录 需要交换的两个数字的坐标
	swapIndex1, swapIndex2 := -1, 0

	// 倒序遍历字符串
	for i := len(s) - 2; i >= 0; i-- {
		// 如果当前数字右边有比他大的数字
		if s[i] > s[maxIndex] {
			maxIndex = i
		} else if s[i] < s[maxIndex] {
			// 如果当前数字比最大数字小
			swapIndex1 = i
			swapIndex2 = maxIndex

		}
	}

	// 如果没有需要交换的数字
	if swapIndex1 == -1 {
		return num
	}

	// 交换两个数字
	sByte := []byte(s)
	sByte[swapIndex1], sByte[swapIndex2] = sByte[swapIndex2], sByte[swapIndex1]
	res, _ := strconv.Atoi(string(sByte))
	return res
}
