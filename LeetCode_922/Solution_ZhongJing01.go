// Package LeetCode_922 按奇偶排序数组 II
package LeetCode_922

func sortArrayByParityII(nums []int) []int {
	for left, right := 0, 1; left < len(nums); left += 2 {
		// left代表偶数，如果当前数字是奇数，就得交换
		if nums[left]%2 == 1 {
			// right代表奇数，找到right上第一个偶数
			for nums[right]%2 == 1 {
				right += 2
			}
			nums[left], nums[right] = nums[right], nums[left]
		}
	}
	return nums
}
