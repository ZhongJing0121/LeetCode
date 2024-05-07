package LeetCode_1005_01

// 1005.K 次取反后最大化的数组和
func largestSumAfterKNegations(nums []int, k int) (sum int) {
	m, sum := make(map[int]int), 0

	// 记录出现次数和总和
	for _, num := range nums {
		m[num]++
		sum += num
	}

	// 在k范围内，把尽可能小的小数变成正数
	for i := -100; i < 0 && k != 0; i++ {
		if m[i] > 0 {
			d := min(k, m[i])
			sum -= i * 2 * d
			k -= d
			m[-i] += d
		}
	}

	// 如果k没用完，且不存在0（存在0可以无责任消耗k），且k是奇数（偶数可以无责任消耗k）
	if k > 0 && k%2 != 0 && m[0] == 0 {
		for i := 1; i <= 100; i++ {
			if m[i] > 0 {
				sum -= i * 2
				break
			}
		}
	}

	return sum
}
