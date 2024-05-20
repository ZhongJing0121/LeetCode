package LeetCode_2200_01

// 2200.找出数组中的所有 K 近邻下标
func findKDistantIndices(nums []int, key int, k int) []int {
	kIndex := make([]int, 0)

	for i, num := range nums {
		if num == key {
			kIndex = append(kIndex, i)
		}
	}

	if len(kIndex) == 0 {
		return []int{}
	}

	res := make([]int, 0)
	for i := range nums {
		for _, kIdx := range kIndex {
			if abs(i-kIdx) <= k {
				res = append(res, i)
				break
			}
		}
	}
	return res
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}
