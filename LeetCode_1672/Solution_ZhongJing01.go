// Package LeetCode_1672 最富有客户的资产总量
package LeetCode_1672

import "math"

func maximumWealth(accounts [][]int) int {
	maxAccounts := math.MinInt

	for _, accountArr := range accounts {
		maxAccounts = max(maxAccounts, sum(accountArr))
	}

	return maxAccounts
}

// 求数组和
func sum(numbers []int) (sum int) {
	for _, number := range numbers {
		sum += number
	}
	return
}
