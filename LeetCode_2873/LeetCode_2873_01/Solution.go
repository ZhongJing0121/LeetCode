package LeetCode_2873_01

// 2873.有序三元组中的最大值 I
func maximumTripletValue(nums []int) int64 {
	res, maxDiff, maxPre := 0, 0, 0

	for _, num := range nums {
		res = max(res, maxDiff*num)
		maxDiff = max(maxDiff, maxPre-num)
		maxPre = max(maxPre, num)
	}

	return int64(res)
}
