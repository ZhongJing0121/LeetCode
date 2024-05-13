package LeetCode_1282_01

// 1282.用户分组
func groupThePeople(groupSizes []int) [][]int {
	m := make(map[int][]int)

	for i, group := range groupSizes {
		m[group] = append(m[group], i)
	}

	res := make([][]int, 0)
	for k, v := range m {
		for i := 0; i < len(v); i += k {
			res = append(res, v[i:i+k])
		}
	}

	return res
}
