package LeetCode_1252_01

// 1252.奇数值单元格的数目
func oddCells(m int, n int, indices [][]int) int {
	rows, cols := make([]int, m), make([]int, n)

	// 每一行每一列都被加了多少次
	for _, indic := range indices {
		rows[indic[0]]++
		cols[indic[1]]++
	}

	// 统计行列中有多少个奇数
	count1, count2 := 0, 0

	for i := 0; i < m; i++ {
		count1 += rows[i] % 2
	}

	for i := 0; i < n; i++ {
		count2 += cols[i] % 2
	}

	return count1*(n-count2) + count2*(m-count1)
}
