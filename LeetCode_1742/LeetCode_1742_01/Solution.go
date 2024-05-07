package LeetCode_1742_01

// 1742.盒子中小球的最大数量
func countBalls(lowLimit int, highLimit int) int {
	m, maxCount := [46]int{}, -1

	for i := lowLimit; i <= highLimit; i++ {
		sum := getNumBitsSum(i)
		m[sum]++
		maxCount = max(maxCount, m[sum])
	}

	return maxCount
}

// 获取数字各位上的和
func getNumBitsSum(num int) (sum int) {
	for num > 0 {
		sum += num % 10
		num /= 10
	}
	return
}
