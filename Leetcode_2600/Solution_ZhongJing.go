package Leetcode_2600

// 日期：2023-07-05
// 作者：仲景
func kItemsWithMaximumSum(numOnes int, numZeros int, numNegOnes int, k int) int {
	if k < numOnes {
		return k
	} else if k <= numOnes+numZeros {
		return numOnes
	} else {
		return numOnes - (k - numZeros - numOnes)
	}
}
