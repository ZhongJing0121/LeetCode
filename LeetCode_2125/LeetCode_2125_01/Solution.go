package LeetCode_2125_01

import "strings"

// 2125.银行中的激光束数量
func numberOfBeams(bank []string) (res int) {
	l := len(bank)
	preCount := strings.Count(bank[0], "1")
	for i := 1; i < l; i++ {
		curCount := strings.Count(bank[i], "1")
		if curCount > 0 {
			res += preCount * curCount
			preCount = curCount
		}
	}
	return
}
