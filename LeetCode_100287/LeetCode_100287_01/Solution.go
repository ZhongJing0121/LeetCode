package LeetCode_100287_01

import "sort"

// 100287.找出与数组相加的整数 II
func minimumAddedInteger(nums1 []int, nums2 []int) int {
	sort.Ints(nums1)
	sort.Ints(nums2)
	for i := 2; i < len(nums1); i++ {
		diff := nums2[0] - nums1[i]

		j := 0
		for _, v := range nums1[i:] {
			if nums2[j]-v == diff {
				j++
				if j == len(nums2) {
					return diff
				}
			}
		}
	}
	return 0
}
