// Package LeetCode_2951 找出峰值
package LeetCode_2951

func findPeaks(mountain []int) []int {
	res := make([]int, 0, len(mountain)/2)
	for i := 1; i < len(mountain)-1; i++ {
		if mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1] {
			res = append(res, i)
		}
	}
	return res
}
