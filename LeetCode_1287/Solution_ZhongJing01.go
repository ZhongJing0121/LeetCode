// Package LeetCode_1287 有序数组中出现次数超过25%的元素
package LeetCode_1287

import "fmt"

func findSpecialInteger(arr []int) (res int) {
	target := len(arr) / 4

	for left, right := 0, 0; left < len(arr); {
		right = left + 1
		for right < len(arr) && arr[left] == arr[right] {
			right++
		}
		if right-left+1 >= target {
			return arr[left]
		}
		left = right
	}

	return -1
}

func main() {
	fmt.Printf("%v", findSpecialInteger([]int{1, 2, 2, 6, 6, 6, 6, 7, 10}))
}
