package LeetCode_2639_01

// 2639.查询网格图中每一列的宽度
func findColumnWidth(grid [][]int) []int {
	m, n := len(grid), len(grid[0])
	res := make([]int, n)

	for i := 0; i < n; i++ {
		maxBit := 0
		for j := 0; j < m; j++ {
			maxBit = max(getNumberBit(grid[j][i]), maxBit)
		}
		res[i] = maxBit
	}
	return res
}

// 获取数字的位数
func getNumberBit(num int) (count int) {
	if num <= 0 {
		count += 1
	}
	for num != 0 {
		count += 1
		num /= 10
	}
	return
}
