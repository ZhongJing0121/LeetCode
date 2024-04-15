// Package LeetCode_747 至少是其他数字两倍的最大数
package LeetCode_747

func dominantIndex(nums []int) int {
	maxValue, secondLargestValue, index := -1, -1, 0

	for i, v := range nums {
		if v > maxValue {
			maxValue, secondLargestValue, index = v, maxValue, i
		} else if v > secondLargestValue {
			secondLargestValue = v
		}
	}

	if maxValue >= secondLargestValue*2 {
		return index
	}

	return -1
}
