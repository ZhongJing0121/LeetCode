package LeetCode_1200

import (
	"math"
	"sort"
)

// 1200.最小绝对差
func solutionZhongJing01(arr []int) [][]int {
	// 正序排序
	sort.Ints(arr)

	res := make([][]int, 0)

	// 遍历数组
	for i, minInt := 0, math.MaxInt; i < len(arr)-1; i++ {
		if diff := arr[i+1] - arr[i]; diff < minInt {
			// 如果当前差值小于历史最小值，清空结果集，添加当前结果
			minInt = diff
			res = [][]int{{arr[i], arr[i+1]}}
		} else if diff == minInt {
			// 如果当前插值与最小值相等
			res = append(res, []int{arr[i], arr[i+1]})
		}
	}
	return res
}
