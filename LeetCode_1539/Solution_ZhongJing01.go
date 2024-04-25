// Package LeetCode_1539 第 k 个缺失的正整数
package LeetCode_1539

func findKthPositive(arr []int, k int) int {
	if arr[0] > k {
		return k
	}

	for _, v := range arr {
		if v <= k {
			k++
		}
	}
	return k
}
