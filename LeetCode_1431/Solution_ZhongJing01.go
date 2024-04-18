// Package LeetCode_1431 拥有最多糖果的孩子
package LeetCode_1431

func kidsWithCandies(candies []int, extraCandies int) (res []bool) {
	maxNum := -1

	for _, v := range candies {
		if v > maxNum {
			maxNum = v
		}
	}

	for _, v := range candies {
		if maxNum-v <= extraCandies {
			res = append(res, true)
		} else {
			res = append(res, false)
		}
	}

	return
}
