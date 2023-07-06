package LeetCode_2178

// 日期：2023-07-06
// 作者：仲景
func maximumEvenSplit(finalSum int64) []int64 {
	if finalSum%2 != 0 {
		return []int64{}
	}
	res, num := make([]int64, 0), int64(2)

	for num <= finalSum {
		res = append(res, num)
		finalSum -= num
		num += 2
	}
	res[len(res)-1] += finalSum
	return res
}
