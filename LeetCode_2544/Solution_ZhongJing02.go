// Package LeetCode_2544 交替数字和
// 日期：2024年4月17日
package LeetCode_2544

func alternateDigitSum02(n int) int {
	nums, flag, res := make([]int, 0), 1, 0

	for index := 0; n > 0; index++ {
		nums = append(nums, n%10)
		n /= 10
	}

	if len(nums)%2 == 0 {
		flag *= -1
	}

	for _, num := range nums {
		res += num * flag
		flag *= -1
	}

	return res
}
