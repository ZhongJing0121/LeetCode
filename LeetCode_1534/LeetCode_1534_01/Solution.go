package LeetCode_1534_01

// 1534.统计好三元组
func countGoodTriplets(arr []int, a int, b int, c int) int {
	l, res := len(arr), 0
	for i := 0; i <= l-3; i++ {
		for j := i + 1; j <= l-2; j++ {
			if abs(arr[i]-arr[j]) > a {
				continue
			}
			for k := j + 1; k <= l-1; k++ {
				if abs(arr[j]-arr[k]) <= b && abs(arr[i]-arr[k]) <= c {
					res++
				}
			}
		}
	}
	return res
}

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}
