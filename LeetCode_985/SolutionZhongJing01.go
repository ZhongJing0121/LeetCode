package LeetCode_985

// 985.查询后的偶数和
func sumEvenAfterQueries(nums []int, queries [][]int) []int {
	res := make([]int, len(queries))
	evenSum := 0 // 初始化偶数和

	for _, num := range nums {
		if num%2 == 0 {
			evenSum += num
		}
	}

	// 遍历queries
	for i, query := range queries {
		val, index := query[0], query[1]
		oldValue := nums[index]
		newValue := oldValue + val

		// 如果之前是偶数，先减掉
		if oldValue%2 == 0 {
			evenSum -= oldValue
		}

		// 如果现在是偶数，加上现在的值
		if newValue%2 == 0 {
			evenSum += newValue
		}

		// 更新nums数组
		nums[index] = newValue
		res[i] = evenSum
	}

	return res
}
