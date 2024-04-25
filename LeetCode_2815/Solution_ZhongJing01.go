// Package LeetCode_2815 数组中的最大数对和
package LeetCode_2815

import (
	"sort"
)

func maxSum(nums []int) int {
	m := make(map[int][]int)

	for _, num := range nums {
		maxBitNum := maxBitNumber(num)
		m[maxBitNum] = append(m[maxBitNum], num)
	}

	// 如果没有最大位相同的直接返回
	if len(m) == 0 {
		return -1
	}

	// 如果有，计算最大值
	mxSum := -1
	for _, v := range m {
		// 组不成数对就返回
		if len(v) < 2 {
			continue
		}
		// 能组成至少一对，排序取能组成的最大值
		sort.Ints(v)
		mxSum = max(mxSum, v[len(v)-1]+v[len(v)-2])
	}
	return mxSum
}

func maxBitNumber(num int) int {
	maxBit := -1
	for num > 0 {
		curBit := num % 10
		maxBit = max(maxBit, curBit)
		num /= 10
	}
	return maxBit
}
