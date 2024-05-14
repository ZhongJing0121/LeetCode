package LeetCode_2670_01

// 2670.找出不同元素数目差数组
func distinctDifferenceArray(nums []int) []int {
	m := make(map[int]bool)
	suffNums := make([]int, len(nums))
	for i := len(nums) - 1; i >= 0; i-- {
		suffNums[i] = len(m)
		m[nums[i]] = true
	}

	m = make(map[int]bool)
	res := make([]int, len(nums))
	for i, num := range nums {
		m[num] = true
		res[i] = len(m) - suffNums[i]
	}
	return res
}
