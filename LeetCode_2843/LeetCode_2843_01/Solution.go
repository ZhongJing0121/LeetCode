package LeetCode_2843_01

import "strconv"

// 2843.统计对称整数的数目
func countSymmetricIntegers(low int, high int) (count int) {
	for i := low; i <= high; i++ {
		numStr := strconv.Itoa(i)
		n := len(numStr)

		if n%2 != 0 {
			continue
		}

		sum := 0
		for _, c := range numStr[:n/2] {
			sum += int(c - '0')
		}

		for _, c := range numStr[n/2:] {
			sum -= int(c - '0')
		}

		if sum == 0 {
			count++
		}
	}
	return
}
