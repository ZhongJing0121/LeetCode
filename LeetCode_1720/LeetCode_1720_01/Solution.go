package LeetCode_1720_01

// 1720.解码异或后的数组
func decode(encoded []int, first int) []int {
	res := make([]int, len(encoded)+1)

	res[0] = first

	for i := 0; i < len(encoded); i++ {
		res[i+1] = res[i] ^ encoded[i]
	}

	return res
}
