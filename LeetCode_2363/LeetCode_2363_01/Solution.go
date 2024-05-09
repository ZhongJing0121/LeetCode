package LeetCode_2363_01

// 2363.合并相似的物品
func mergeSimilarItems(items1 [][]int, items2 [][]int) [][]int {
	m := make([]int, 1001)
	for i := 0; i < len(items1); i++ {
		m[items1[i][0]] += items1[i][1]
	}
	for i := 0; i < len(items2); i++ {
		m[items2[i][0]] += items2[i][1]
	}

	res := make([][]int, 0, len(m))
	for i := 0; i < len(m); i++ {
		if m[i] > 0 {
			res = append(res, []int{i, m[i]})
		}
	}
	return res
}
