package LeetCode_2144_01

import "sort"

// 2144.打折购买糖果的最小开销
func minimumCost(cost []int) (sum int) {
	sort.Ints(cost)

	for i, j := len(cost)-1, 1; i >= 0; i-- {
		if j%3 != 0 {
			sum += cost[i]
		}
		j = (j + 1) % 3
	}
	return
}
