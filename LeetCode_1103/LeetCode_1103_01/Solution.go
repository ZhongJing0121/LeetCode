package LeetCode_1103_01

// 1103.分糖果 II
func distributeCandies(candies int, num_people int) []int {
	res := make([]int, num_people)

	for i := 0; candies > 0; i++ {
		cur := min(i+1, candies)
		res[i%num_people] += cur
		candies -= cur
	}

	return res
}
