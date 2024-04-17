// Package LeetCode_852 山脉数组的峰顶索引
package LeetCode_852

func peakIndexInMountainArray(arr []int) int {
	// 二分查找
	left, right := 0, len(arr)-1
	mid := left + (right-left+1)/2
	for left <= right {
		if arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1] {
			// 找到了
			return mid
		} else if arr[mid] < arr[mid-1] {
			// 下降趋势，峰顶在左
			right = mid - 1
		} else {
			// 上升趋势，峰顶在右
			left = mid + 1
		}
		mid = left + (right-left+1)/2
	}
	return -1
}
