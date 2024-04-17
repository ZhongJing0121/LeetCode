// Package LeetCode_1189 “气球” 的最大数量
package LeetCode_1189

func maxNumberOfBalloons(text string) int {
	var bCount, aCount, lCount, oCount, nCount int

	for _, char := range text {
		if char == 'b' {
			bCount++
		} else if char == 'a' {
			aCount++
		} else if char == 'l' {
			lCount++
		} else if char == 'o' {
			oCount++
		} else if char == 'n' {
			nCount++
		}
	}

	lCount, oCount = lCount/2, oCount/2

	if bCount == 0 || aCount == 0 || lCount == 0 || oCount == 0 || nCount == 0 {
		return 0
	}

	return min(bCount, aCount, lCount, oCount, nCount)
}
