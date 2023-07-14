package LeetCode_228

import "strconv"

// 日期：2023-07-14
// 作者：仲景
func summaryRanges(nums []int) (ans []string) {
	for i, n := 0, len(nums); i < n; {
		// 记录当前i的值
		left := i
		// 一直找到后序不连续的区间的第一个位置
		for i++; i < n && nums[i-1]+1 == nums[i]; i++ {
		}

		// 先把left加上
		s := strconv.Itoa(nums[left])
		// 如果连续区间的长度>1，取最后的连续区间的值拼接
		if left < i-1 {
			s += "->" + strconv.Itoa(nums[i-1])
		}
		// 添加结果
		ans = append(ans, s)
	}
	return
}
