package LeetCode_2200_01

// 2200.找出数组中的所有 K 近邻下标
func findKDistantIndices(nums []int, key int, k int) []int {
	m := make([]bool, len(nums))

	for i, num := range nums {
		if num == key {
			for j := i; j >= i-k && j >= 0 && !m[j]; j-- {
				m[j] = true
			}

			for j := min(i+k, len(nums)-1); !m[j]; j-- {
				m[j] = true
			}
		}
	}

	res := make([]int, 0)
	for i, v := range m {
		if v {
			res = append(res, i)
		}
	}
	return res
}
