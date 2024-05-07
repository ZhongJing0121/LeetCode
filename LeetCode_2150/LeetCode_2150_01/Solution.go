package LeetCode_2150_01

// 2150.找出数组中的所有孤独数字
func findLonely(nums []int) []int {
	countMap := make(map[int]int)

	for _, num := range nums {
		countMap[num]++
	}

	res := make([]int, 0)
	for k, v := range countMap {
		if v == 1 && countMap[k-1] == 0 && countMap[k+1] == 0 {
			res = append(res, k)
		}
	}

	return res
}
