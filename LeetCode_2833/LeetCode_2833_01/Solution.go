package LeetCode_2833_01

// 2833.距离原点最远的点
func furthestDistanceFromOrigin(moves string) int {
	count1, count2, count3 := 0, 0, 0
	abs := func(x int) int {
		if x < 0 {
			return -x
		}
		return x
	}
	for _, c := range moves {
		if c == 'L' {
			count1++
		} else if c == 'R' {
			count2++
		} else {
			count3++
		}
	}
	return abs(count1-count2) + count3
}

func Solution(moves string) int {
	return furthestDistanceFromOrigin(moves)
}
