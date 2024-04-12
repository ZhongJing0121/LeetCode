package LeetCode_2678

import "strconv"

// SolutionZhongJing01
// 2678.老人的数目
func SolutionZhongJing01(details []string) int {
	res := 0
	for _, detail := range details {
		if num, err := strconv.Atoi(detail[11:13]); err == nil && num > 60 {
			res += 1
		}
	}
	return res
}
