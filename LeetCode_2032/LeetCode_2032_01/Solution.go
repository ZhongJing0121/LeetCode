package LeetCode_2032_01

// 2032.至少在两个数组中出现的值
func twoOutOfThree(nums1 []int, nums2 []int, nums3 []int) []int {
	m, res := [101]int{}, make([]int, 0)

	for _, num := range nums1 {
		m[num] |= 1
	}

	for _, num := range nums2 {
		m[num] |= 1 << 1
	}

	for _, num := range nums3 {
		m[num] |= 1 << 2
	}

	for num, numCount := range m {
		// m & (m-1)可以消除m最低位的1，如果消除最后一个1以后还大于0，
		// 说明还有1，就是至少2个数组中出现过
		if numCount&(numCount-1) > 0 {
			res = append(res, num)
		}
	}
	return res
}
