package LeetCode_2303_01

// 2303.计算应缴税款总额
func calculateTax(brackets [][]int, income int) (res float64) {
	pre := 0
	for i := 0; i < len(brackets); i++ {
		res += float64((min(brackets[i][0], income)-pre)*brackets[i][1]) / 100.0
		pre = brackets[i][0]
		if income <= brackets[i][0] {
			break
		}
	}
	return
}
