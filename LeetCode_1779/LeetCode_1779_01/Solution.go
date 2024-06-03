package LeetCode_1779_01

import "math"

// 1779.找到最近的有相同 X 或 Y 坐标的点
func nearestValidPoint(x int, y int, points [][]int) int {
	minV, minIndex := math.MaxInt, -1
	for i, v := range points {
		if v[0] == x || v[1] == y {
			if t := abs(v[0]-x) + abs(v[1]-y); t < minV {
				minV = t
				minIndex = i
			}
		}
	}
	return minIndex
}

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}
