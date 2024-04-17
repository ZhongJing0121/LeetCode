// Package LeetCode_1122 数组的相对排序
package LeetCode_1122

func relativeSortArray(arr1 []int, arr2 []int) []int {
	// 创建一个1001个容量的桶
	arr1Heap := make([]int, 1001)

	// 遍历arr1，构建桶
	for _, v := range arr1 {
		arr1Heap[v]++
	}

	// 记录结果
	res := make([]int, len(arr1))
	index := 0

	// 遍历arr2
	for _, v := range arr2 {
		// 这个数在arr1里存在几次，就插入几次
		for i := 0; i < arr1Heap[v]; i++ {
			res[index] = v
			index++
		}
		arr1Heap[v] = 0
	}

	// 遍历桶
	for i, v := range arr1Heap {
		// i：数字 v：次数
		for j := 0; j < v; j++ {
			res[index] = i
			index++
		}
	}

	return res
}
