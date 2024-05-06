package LeetCode_2570_01

// 2570.合并两个二维数组 - 求和法
func mergeArrays(nums1 [][]int, nums2 [][]int) [][]int {
	res := make([][]int, 0)

	i, j := 0, 0
	for i < len(nums1) && j < len(nums2) {
		if nums1[i][0] < nums2[j][0] {
			res = append(res, nums1[i])
			i += 1
		} else if nums1[i][0] > nums2[j][0] {
			res = append(res, nums2[j])
			j += 1
		} else {
			res = append(res, []int{nums1[i][0], nums2[j][1] + nums1[i][1]})
			i, j = i+1, j+1
		}
	}

	// 清除残留
	if i < len(nums1) {
		res = append(res, nums1[i:]...)
	}
	if j < len(nums2) {
		res = append(res, nums2[j:]...)
		j += 1
	}
	return res
}
