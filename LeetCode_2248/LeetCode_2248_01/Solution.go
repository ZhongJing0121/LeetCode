package LeetCode_2248_01

// 2248.多个数组求交集
func intersection(nums [][]int) []int {
	numberCountMap, n := make([]int, 1001), len(nums)

	for _, arr := range nums {
		for _, num := range arr {
			numberCountMap[num]++
		}
	}

	res := make([]int, 0)
	for i, v := range numberCountMap {
		if v == n {
			res = append(res, i)
		}
	}

	return res
}
