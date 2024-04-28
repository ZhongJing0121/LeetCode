package LeetCode_100285_01

// 100285.找出与数组相加的整数 I
func addedInteger(nums1 []int, nums2 []int) int {
	min1, min2 := 1001, 1001

	for _, num := range nums1 {
		min1 = min(min1, num)
	}

	for _, num := range nums2 {
		min2 = min(min2, num)
	}

	return min2 - min1
}
