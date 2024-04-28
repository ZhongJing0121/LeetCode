package LeetCode_860_02

// 860.柠檬水找零
func lemonadeChange(bills []int) bool {
	count5, count10 := 0, 0

	for _, bill := range bills {
		if bill == 5 {
			count5++
		} else if bill == 10 {
			count5--
			count10++
		} else if count10 > 0 {
			count5--
			count10--
		} else {
			count5 -= 3
		}

		if count5 < 0 {
			return false
		}
	}
	return true
}
