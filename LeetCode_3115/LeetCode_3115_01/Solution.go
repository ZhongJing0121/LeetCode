package LeetCode_3115_01

// 3115.质数的最大距离
func maximumPrimeDifference(nums []int) int {
	res, left, right := 0, -1, -1
	for i := 0; i < len(nums); i++ {
		if isPrime(nums[i]) {
			left = i
			break
		}
	}

	for i := len(nums) - 1; i >= 0; i-- {
		if isPrime(nums[i]) {
			right = i
			break
		}
	}

	if left == -1 || right == -1 {
		return res
	}

	return right - left
}

// 判断一个数是不是质数
func isPrime(n int) bool {
	if n <= 1 {
		return false
	}
	if n <= 3 {
		return true
	}
	if n%2 == 0 || n%3 == 0 {
		return false
	}
	for i := 5; i*i <= n; i = i + 6 {
		if n%i == 0 || n%(i+2) == 0 {
			return false
		}
	}
	return true
}
