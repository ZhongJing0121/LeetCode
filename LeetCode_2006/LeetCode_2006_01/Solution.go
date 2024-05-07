package LeetCode_2006_01

// 2006.差的绝对值为 K 的数对数目
func countKDifference(nums []int, k int) (res int) {
	m := make(map[int]int)

	for _, num := range nums {
		res += m[num-k] + m[num+k]
		m[num]++
	}

	return
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}
