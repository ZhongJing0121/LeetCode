package LeetCode_2133_01

// 2133.检查是否每一行每一列都包含全部整数
func checkValid(matrix [][]int) bool {
	countMap := make([]int, 101)

	// 按行遍历
	for i, arr := range matrix {
		for _, j := range arr {
			// 如果这个数字在之前行分别只出现了1次，那么次数应该是i
			// 不是i就表示有重复，直接返回false
			if countMap[j] != i {
				return false
			}
			countMap[j]++
		}
	}

	// 按列遍历
	for i := 0; i < len(matrix[0]); i++ {
		for j := 0; j < len(matrix); j++ {
			// 如果行都是符合要求的，那么现在countMap中每个数都是len(matrix)
			// 套用行的逻辑，如果当前列中数字只出现1次，那么每个数字的出现次数都应该是len(matrix)+i
			if countMap[matrix[j][i]] != len(matrix)+i {
				return false
			}
			countMap[matrix[j][i]]++
		}
	}

	return true
}
