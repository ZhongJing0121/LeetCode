package LeetCode_2869_01

// 2869.收集元素的最少操作次数
func minOperations(nums []int, k int) (res int) {
	set := make(map[int]bool)

	for i := len(nums) - 1; i >= 0; i-- {
		res++
		if nums[i] >= 1 && nums[i] <= k {
			set[nums[i]] = true
		}
		if len(set) == k {
			break
		}
	}
	return
}
