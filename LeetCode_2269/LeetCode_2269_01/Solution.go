package LeetCode_2269_01

import "strconv"

// 2269.找到一个数字的 K 美丽值
func divisorSubstrings(num, k int) (ans int) {
	s := strconv.Itoa(num)
	for i := k; i <= len(s); i++ {
		v, _ := strconv.Atoi(s[i-k : i])
		if v != 0 && num%v == 0 {
			ans++
		}
	}
	return
}
