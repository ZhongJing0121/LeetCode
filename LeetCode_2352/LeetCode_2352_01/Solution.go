package LeetCode_2352_01

import (
	"strconv"
	"strings"
)

// 2352.相等行列对
func equalPairs(grid [][]int) (res int) {
	m, l := make(map[string]int), len(grid)

	// 遍历每一行
	for _, g := range grid {
		sb := strings.Builder{}
		for _, num := range g {
			sb.WriteString(strconv.Itoa(num) + "-")
		}
		m[sb.String()]++
	}

	// 遍历每一列
	for i := 0; i < l; i++ {
		sb := strings.Builder{}
		for j := 0; j < l; j++ {
			sb.WriteString(strconv.Itoa(grid[j][i]) + "-")
		}
		if c, ok := m[sb.String()]; ok {
			res += c
		}
	}
	return
}
