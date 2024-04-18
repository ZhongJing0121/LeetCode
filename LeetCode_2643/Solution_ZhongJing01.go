// Package LeetCode_2643 一最多的行
package LeetCode_2643

func rowAndMaximumOnes(mat [][]int) []int {
	res := []int{-1, -1}

	for rowIndex, row := range mat {
		count := 0
		for _, col := range row {
			if col == 1 {
				count++
			}
		}
		if count > res[1] {
			res[0], res[1] = rowIndex, count
		}
	}

	return res
}
