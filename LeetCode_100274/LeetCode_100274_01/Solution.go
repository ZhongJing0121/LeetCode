package LeetCode_100274_01

import "math"

// 100274.从魔法师身上吸取的最大能量
func maximumEnergy(energy []int, k int) int {
	res := math.MinInt

	for i := len(energy) - k; i < len(energy); i++ {
		curSum := 0
		for j := i; j >= 0; j -= k {
			curSum += energy[j]
			res = max(res, curSum)
		}
	}
	return res
}
