package LeetCode_2582_01

// 2582.递枕头
func passThePillow(n int, time int) int {
	a := time / (n - 1)
	b := time % (n - 1)
	if a%2 == 0 {
		return 1 + b
	}
	return n - b
}
