package LeetCode_2562_01

// 2562.找出数组的串联值
func findTheArrayConcVal(nums []int) int64 {
	res := int64(0)
	for left, right := 0, len(nums)-1; left < right; left, right = left+1, right-1 {
		res += add(nums[left], nums[right])
	}
	if len(nums)%2 != 0 {
		res += add(nums[len(nums)/2], 0)
	}
	return res
}

// 串联两个数字
func add(num1, num2 int) int64 {
	res := num1
	for n2 := num2; n2 > 0; n2 = n2 / 10 {
		res *= 10
	}
	return int64(res) + int64(num2)
}
