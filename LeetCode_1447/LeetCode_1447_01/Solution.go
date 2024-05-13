package LeetCode_1447_01

import "strconv"

// 1447.最简分数
func simplifiedFractions(n int) []string {
	res := make([]string, 0)

	for i := 1; i <= n; i++ {
		for j := i + 1; j <= n; j++ {
			if gcd(i, j) == 0 {
				res = append(res, strconv.Itoa(i)+"/"+strconv.Itoa(j))
			}
		}
	}
	return res
}

func gcd(a, b int) int {
	for b != 0 {
		a, b = b, a%b
	}
	return a
}
